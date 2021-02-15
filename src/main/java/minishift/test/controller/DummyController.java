package minishift.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DummyController.class);
	
	@GetMapping
	public ResponseEntity<String> isAlive(){
		
		MultiValueMap<String, String> responseHeaders = new HttpHeaders();
		String responseBody = "isAlive()";
		ResponseEntity<String> response = new ResponseEntity<>(responseBody, responseHeaders, HttpStatus.OK);
		LOGGER.info("----- request received !!! -----");
		
		return response;
	}

}
