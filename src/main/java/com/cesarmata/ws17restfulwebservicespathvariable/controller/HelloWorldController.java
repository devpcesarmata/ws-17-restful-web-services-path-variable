/**
 * 
 */
package com.cesarmata.ws17restfulwebservicespathvariable.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cesarmata.ws17restfulwebservicespathvariable.bean.HelloWorldBean;

/**
 * @author Cesar Mata.
 *
 */
@RestController
public class HelloWorldController {

	@GetMapping(path= "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello world, %s", name));
	}
}
