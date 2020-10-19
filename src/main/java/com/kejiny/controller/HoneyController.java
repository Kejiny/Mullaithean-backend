package com.kejiny.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kejiny.model.Honey;
import com.kejiny.service.HoneyService;


@RestController
@RequestMapping(value = "/honey")
public class HoneyController {

	@Autowired
	private HoneyService honeyService;
	
	@PostMapping
	public ResponseEntity <Honey> createHoney(@RequestBody Honey honey){
		System.out.println("hi");
		return honeyService.createHoney(honey);
	}
} 
