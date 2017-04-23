package com.nirakar.restfull.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestFull {

	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<String> helloWorlds() {

		HttpHeaders headers = new HttpHeaders();

		headers.add("Number Of Records Found", "1");
		return new ResponseEntity<String>("Hello World", headers, HttpStatus.OK);
	}

	@RequestMapping(value = "/getDemo", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<String> getDemo() {

		HttpHeaders headers = new HttpHeaders();

		headers.add("Number Of Records Found", "1");
		return new ResponseEntity<String>("Get Method restfull web services",
				headers, HttpStatus.OK);
	}
}
