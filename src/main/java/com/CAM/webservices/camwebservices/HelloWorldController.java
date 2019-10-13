package com.CAM.webservices.camwebservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {

	@Autowired
	private HelloWorldService helloWorldService;
	
	@Autowired
	private HelloWorldJPARepository helloWorldJPARepository;
	private Persons person = new Persons(10002, "Ghuge", "Mahesh", "Pune", "Pune");
	//GET
	//URI- /hello-world
	//
	@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	public String HelloWorld() {
		helloWorldJPARepository.save(person);
		return "Hello World!";
	}
}
