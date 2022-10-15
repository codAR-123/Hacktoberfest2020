package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.User;
import com.examly.springapp.repository.UserRepository;
@Service
public class UserService {
    @Autowired
	private UserRepository userrepo;
	
	public UserService(UserRepository userrepo) {
		super();
		this.userrepo = userrepo;
	}
	public UserService() {
		
	}
	
	public void saveAll(User user){
	    userrepo.save(user);
	}
}
