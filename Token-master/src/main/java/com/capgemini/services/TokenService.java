package com.capgemini.services;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.capgemini.beans.TokenCorrect;
import com.capgemini.beans.TokenValidationEntity;

@Service
public class TokenService {

	public ResponseEntity<TokenValidationEntity> sendToken(){
		TokenValidationEntity tokenValidationEntity = new TokenValidationEntity();
		tokenValidationEntity.setToken("123");
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", tokenValidationEntity.getToken());
		
		return new ResponseEntity<>(tokenValidationEntity, headers, HttpStatus.OK);
	}
	
	public TokenCorrect checkToken(TokenValidationEntity token){
		TokenCorrect tokenCorrect = new TokenCorrect();
		if(validateToken(token.getToken())) {
			tokenCorrect.setTokenCorrect("0");
			return tokenCorrect;
		}
		return tokenCorrect;
	}
	
	
	public boolean validateToken(String token) {
		return token.equals("123");
	}
}
