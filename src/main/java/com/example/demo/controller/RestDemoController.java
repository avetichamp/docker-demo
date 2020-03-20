package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Message;

@RestController
public class RestDemoController {

	@GetMapping("/hello")
	public Message sayHello() {
		Message m = new Message();
		m.setContent("This is docker for Spring");
		return m;
	}
}
