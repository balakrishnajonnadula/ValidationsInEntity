package com.cms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cms.entities.UserEntity;
import com.cms.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/")
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("users")
	public ResponseEntity<UserEntity> createUser(@Valid @RequestBody UserEntity user){
		UserEntity createUser = service.createUser(user);
		
		return new ResponseEntity<UserEntity>(createUser,HttpStatus.CREATED);
	}
}
