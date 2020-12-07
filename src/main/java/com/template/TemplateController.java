package com.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author Ram Chetan
*/

@RestController
public class TemplateController {

	@Autowired
	private TemplateService templateService;

	@PostMapping("/generatesamlresponse")
	public ResponseEntity<String> generateSAMLResponse(@RequestBody UserDetails userDetails) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(templateService.getTemplate(userDetails));
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
		}
	}
}
