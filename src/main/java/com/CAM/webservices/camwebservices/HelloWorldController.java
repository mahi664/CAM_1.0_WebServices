package com.CAM.webservices.camwebservices;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {

	//GET
	//URI- /hello-world
	//
	@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	public String HelloWorld() {
		return "Hello World!";
	}
}
