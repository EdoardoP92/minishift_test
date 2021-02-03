package minishift.test.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {
	
	@GetMapping
	public ResponseEntity<String> isAlive(){
		
		MultiValueMap<String, String> responseHeaders = new HttpHeaders();
		String responseBody = "isAlive()";
		ResponseEntity<String> response = new ResponseEntity<>(responseBody, responseHeaders, HttpStatus.OK);
		
		return response;
	}

}
