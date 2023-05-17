package com.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.entities.UserEntity;
import com.cms.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository uRepo;
	
	public UserEntity createUser(UserEntity user) {
		return uRepo.save(user);
	}

}
