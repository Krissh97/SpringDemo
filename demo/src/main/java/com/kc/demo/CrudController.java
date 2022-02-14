package com.kc.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
@RequestMapping("/crud")
public class CrudController {
	@GetMapping("/hello")
	public String helloGet() {
		return "Hello From GET";
	}
	@PostMapping("/hello")
	public String helloPost() {
			return "Hello From POST";
	}
	@GetMapping("/hello/{name}/{age}")
	public String showMsg(@PathVariable String name,@PathVariable int age) {
	return name+" "+age;
	}

}
