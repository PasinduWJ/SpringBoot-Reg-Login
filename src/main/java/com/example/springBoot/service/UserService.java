package com.example.springBoot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.springBoot.model.User;
import com.example.springBoot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	
	User save(UserRegistrationDto registrationDto);
}
