package com.example.newController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.UserService;


@RestController
@RequestMapping("/shop")
public class NewController {
	
	
	@GetMapping
	public void getApi() {
		 
	}
}

