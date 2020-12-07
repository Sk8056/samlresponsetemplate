package com.template;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BaseTemplate {

	@Value("${endpoint.destination}")
	private String endpointDestination;

	@Value("${endpoint.destination}")
	private String endpointIssuer;

	@Value("${endpoint.nameId}")
	private String endpointNameId;

	@Value("${endpoint.audience}")
	private String endpointAudience;

	private final String data = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
			+ "<samlp:Response xmlns:samlp=\"urn:oasis:names:tc:SAML:2.0:protocol\" xmlns:saml=\"urn:oasis:names:tc:SAML:2.0:assertion\" ID=\"_57cbe119-04cd-46f5-852a-b5e8073d2483\" Version=\"2.0\" IssueInstant=\"2020-11-13T18:15:25.601Z\" Destination=%sInResponseTo=\"null\">\n"
			+ "   <saml:Issuer>\"%s\"</saml:Issuer>\n"
			+ "   <ds:Signature xmlns:ds=\"http://www.w3.org/2000/09/xmldsig#\">\n" + "      <ds:SignedInfo>\n"
			+ "         <ds:CanonicalizationMethod Algorithm=\"http://www.w3.org/2001/10/xml-exc-c14n#\" />\n"
			+ "         <ds:SignatureMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#rsa-sha1\" />\n"
			+ "         <ds:Reference URI=\"#_57cbe119-04cd-46f5-852a-b5e8073d2483\">\n"
			+ "            <ds:Transforms>\n"
			+ "               <ds:Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\" />\n"
			+ "               <ds:Transform Algorithm=\"http://www.w3.org/2001/10/xml-exc-c14n#\" />\n"
			+ "            </ds:Transforms>\n"
			+ "            <ds:DigestMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#sha1\" />\n"
			+ "            <ds:DigestValue>3wyoZ183Z5EXf/dmYNiRgbi32WY=</ds:DigestValue>\n"
			+ "         </ds:Reference>\n" + "      </ds:SignedInfo>\n"
			+ "      <ds:SignatureValue>o6unyyPS0mBev9iVU8kzSRbQNm0vZUpxf8uEWJA6jgSTGW2XcXKonYLbfiQMVuRFC4X3zrkNCWwaoK2RC9FNUri8/Zcb1Mcnm5lXPlnN0getP8ZMDD7WuhZ9J9K+HONnr0CBgpnv+0IQ3otcAbAMI3Bs10OTt0C/d53/TcR1F5s=</ds:SignatureValue>\n"
			+ "      <ds:KeyInfo>\n" + "         <ds:X509Data>\n"
			+ "            <ds:X509Certificate>MIIC8DCCAlmgAwIBAgIBADANBgkqhkiG9w0BAQ0FADCBlDELMAkGA1UEBhMCdXMxCzAJBgNVBAgMAkNPMSowKAYDVQQKDCFTcGVjdHJ1bSBCdXNpbmVzcyBQYXJ0bmVyIFByb2dyYW0xEjAQBgNVBAMMCWxvY2FsaG9zdDEaMBgGA1UEBwwRR3JlZW53b29kIFZpbGxhZ2UxHDAaBgNVBAsME1NwZWN0cnVtIEVudGVycHJpc2UwHhcNMjAwNTIzMjAyMjE5WhcNMjEwNTIzMjAyMjE5WjCBlDELMAkGA1UEBhMCdXMxCzAJBgNVBAgMAkNPMSowKAYDVQQKDCFTcGVjdHJ1bSBCdXNpbmVzcyBQYXJ0bmVyIFByb2dyYW0xEjAQBgNVBAMMCWxvY2FsaG9zdDEaMBgGA1UEBwwRR3JlZW53b29kIFZpbGxhZ2UxHDAaBgNVBAsME1NwZWN0cnVtIEVudGVycHJpc2UwgZ8wDQYJKoZIhvcNAQEBBQADgY0AMIGJAoGBAOQzWJa23wpDShCbqbHX4QIoSEY29VIOpysW8sxlwQrlxgwrMHq0lxn4c8CwuWdmyFYPOyC9xLHz79oOnByQivrxHibJ25AwsuQpgXhJ5H9e7pzL35qbZ/6yoZ8Efxh0Hp9rQj6dNAsLgXVxvqEawCGYF2lsKcowrOSh9dPVbXirAgMBAAGjUDBOMB0GA1UdDgQWBBRDGKvRWHcWFaqABOLdGOy2bGTDljAfBgNVHSMEGDAWgBRDGKvRWHcWFaqABOLdGOy2bGTDljAMBgNVHRMEBTADAQH/MA0GCSqGSIb3DQEBDQUAA4GBANS/DYL7Sj220ERH2yJx7/pF1GLl+X759NEsZZyvxoM+PK4XQNZzGCOlhXZCpMhrnxlJn/If26m6YqWkrr2qbjswqvrO5Ugc5a07P3uh6J6ETLdW1j9lvkOqW5hbwkNcdHC5CH55FEDPkd47AfS1LmppBuT64FiDV7N3JguepySl</ds:X509Certificate>\n"
			+ "         </ds:X509Data>\n" + "      </ds:KeyInfo>\n" + "   </ds:Signature>\n" + "   <samlp:Status>\n"
			+ "      <samlp:StatusCode Value=\"urn:oasis:names:tc:SAML:2.0:status:Success\" />\n"
			+ "   </samlp:Status>\n"
			+ "   <saml:Assertion xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" ID=\"_c02cc6a3-70aa-4749-b133-6b9d38531106\" Version=\"2.0\" IssueInstant=\"2020-11-13T18:15:25.601Z\">\n"
			+ "      <saml:Issuer>\"%s\"</saml:Issuer>\n" + "      <saml:Subject>\n"
			+ "         <saml:NameID Format=\"%s\">%s</saml:NameID>\n"
			+ "         <saml:SubjectConfirmation Method=\"urn:oasis:names:tc:SAML:2.0:cm:bearer\">\n"
			+ "            <saml:SubjectConfirmationData NotOnOrAfter=\"2020-11-13T18:20:25.601Z\" Recipient=\"https://keycloak.spectrumtoolbox.com/auth/realms/spectrumenterprise/broker/se-local/endpoint\" InResponseTo=\"null\" />\n"
			+ "         </saml:SubjectConfirmation>\n" + "      </saml:Subject>\n"
			+ "      <saml:Conditions NotBefore=\"2020-11-13T18:15:25.601Z\" NotOnOrAfter=\"2020-11-13T18:20:25.601Z\">\n"
			+ "         <saml:AudienceRestriction>\n" + "            <saml:Audience>\"%s\"</saml:Audience>\n"
			+ "         </saml:AudienceRestriction>\n" + "      </saml:Conditions>\n"
			+ "      <saml:AuthnStatement AuthnInstant=\"2020-11-13T18:15:25.601Z\" SessionNotOnOrAfter=\"2020-11-13T18:20:25.601Z\" SessionIndex=\"267ef501-f6ac-49db-84bb-2ce4ba8dacb2\">\n"
			+ "         <saml:AuthnContext>\n"
			+ "            <saml:AuthnContextClassRef>urn:oasis:names:tc:SAML:2.0:ac:classes:Password</saml:AuthnContextClassRef>\n"
			+ "         </saml:AuthnContext>\n" + "      </saml:AuthnStatement>\n" + "      <saml:AttributeStatement>\n"
			+ "         <saml:Attribute Name=\"mail\" NameFormat=\"urn:oasis:names:tc:SAML:2.0:attrname-format:basic\">\n"
			+ "            <saml:AttributeValue xsi:type=\"xs:string\">%s</saml:AttributeValue>\n"
			+ "         </saml:Attribute>\n"
			+ "         <saml:Attribute Name=\"firstname\" NameFormat=\"urn:oasis:names:tc:SAML:2.0:attrname-format:basic\">\n"
			+ "            <saml:AttributeValue xsi:type=\"xs:string\">%s</saml:AttributeValue>\n"
			+ "         </saml:Attribute>\n"
			+ "         <saml:Attribute Name=\"lastname\" NameFormat=\"urn:oasis:names:tc:SAML:2.0:attrname-format:basic\">\n"
			+ "            <saml:AttributeValue xsi:type=\"xs:string\">%s</saml:AttributeValue>\n"
			+ "         </saml:Attribute>\n"
			+ "         <saml:Attribute Name=\"username\" NameFormat=\"urn:oasis:names:tc:SAML:2.0:attrname-format:basic\">\n"
			+ "            <saml:AttributeValue xsi:type=\"xs:string\">%s</saml:AttributeValue>\n"
			+ "         </saml:Attribute>\n" + "                  </saml:Attribute>\n"
			+ "         <saml:Attribute Name=\"orgnizationname\" NameFormat=\"urn:oasis:names:tc:SAML:2.0:attrname-format:basic\">\n"
			+ "            <saml:AttributeValue xsi:type=\"xs:string\">%s</saml:AttributeValue>\n"
			+ "         </saml:Attribute>\n";

	public BaseTemplate() {
	}

	public String getData() {
		return data;
	}

	public String getEndpointIssuer() {
		return endpointIssuer;
	}

	public void setEndpointIssuer(String endpointIssuer) {
		this.endpointIssuer = endpointIssuer;
	}

	public String getEndpointNameId() {
		return endpointNameId;
	}

	public void setEndpointNameId(String endpointNameId) {
		this.endpointNameId = endpointNameId;
	}

	public String getEndpointAudience() {
		return endpointAudience;
	}

	public void setEndpointAudience(String endpointAudience) {
		this.endpointAudience = endpointAudience;
	}

	public String getEndpointDestination() {
		return endpointDestination;
	}

	public void setEndpointDestination(String endpointDestination) {
		this.endpointDestination = endpointDestination;
	}

	@Override
	public String toString() {
		return "BaseTemplate [data=" + data + "]";
	}

}
