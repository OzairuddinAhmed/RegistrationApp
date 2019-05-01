package com.capgemini.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.beans.TokenCorrect;
import com.capgemini.beans.TokenValidationEntity;
import com.capgemini.services.TokenService;

@RestController
public class TokenController {

	@Autowired
	private TokenService tokenService;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/providetoken")
	public ResponseEntity<TokenValidationEntity> sendToken(){	
		return tokenService.sendToken();
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("/checktoken")
	public TokenCorrect checkToken(@RequestBody TokenValidationEntity token){
		return tokenService.checkToken(token);
	}
}
