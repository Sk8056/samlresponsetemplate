package com.template;


import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * @author Ram Chetan
*/

@Service
public class TemplateService {
	
	@Autowired
	private BaseTemplate baseTemplate;

	public String getTemplate(UserDetails userDetails) throws Exception {
		String input = String.format(baseTemplate.getData(), userDetails.getMail(), userDetails.getFirstName(), userDetails.getLastName(),
				userDetails.getUserName(), userDetails.getOrganizationName());

		if (input != null && !input.isEmpty()) {
			return encodeBase64String(addRoles(userDetails.getRoles(), input));
		} else {
			throw new IllegalStateException("Unable to add users values into saml response");
		}
	}
	
	public String addRoles(List<String> userRoles, String input) {
	  	StringBuilder sb = new StringBuilder();
		for(String str:userRoles) {
			sb.append("            <saml:AttributeValue xsi:type=\"xs:string\">"+ str +"</saml:AttributeValue>\n");
		}			
		sb.append("         </saml:Attribute>\n" +
                "      </saml:AttributeStatement>\n" +
                "   </saml:Assertion>\n" +
                "</samlp:Response>");
		return input.concat(sb.toString());
	}
 
	public String encodeBase64String(String templateString) throws Exception {
		byte[] bytes = templateString.getBytes("UTF-8");
		return Base64.getEncoder().encodeToString(bytes);
	}

	public String decodeBase64String(String encodedString) {
		byte[] decoded = Base64.getDecoder().decode(encodedString);
		return new String(decoded);
	}

}
