package com.example.rest.webservices.restful_web_servies_socialmedia.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest.webservices.restful_web_servies_socialmedia.user.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
}
