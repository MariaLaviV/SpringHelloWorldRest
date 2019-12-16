package com.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Message;

@RestController
public class HelloWorldRestController {
	
	@RequestMapping(value="/")
	public String Welcome(){
		return "Welcome to Spring RestTemplate Example.";
	}
	
	@RequestMapping(value="/hello/{player}")
	public Message message(@PathVariable("player") String player){
		Message msg=new Message(player, "Hello" +player);
		return msg;
	}

}
