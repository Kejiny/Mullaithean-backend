package com.kejiny.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.kejiny.model.Honey;
import com.kejiny.repository.HoneyRepository;

@Service
public class HoneyService {
	
	@Autowired
	private HoneyRepository honeyrepository;

	public ResponseEntity<Honey> createHoney(Honey honey) {
	System.out.println("hi");
		try {
			Honey newHoney = honeyrepository.save(new Honey(honey.getName(),honey.getType(),honey.getQuantity()));
			return new ResponseEntity<>(newHoney,HttpStatus.CREATED);
		}
		catch(Exception e) {
			return new ResponseEntity<>(null,HttpStatus.SERVICE_UNAVAILABLE);
		}
	}

}
