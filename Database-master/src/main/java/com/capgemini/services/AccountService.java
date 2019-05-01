package com.capgemini.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.capgemini.beans.AccountFormFields;
import com.capgemini.beans.AccountDetails;
import com.capgemini.entities.AccountEntity;
import com.capgemini.entities.UserExistsEntity;
import com.capgemini.repositories.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	public AccountDetails putNewAccount(AccountFormFields accountFormFields) {
		AccountEntity accountEntity = new AccountEntity();
		converter(accountFormFields, accountEntity);
		return new AccountDetails((accountRepository.save(accountEntity)).getIdcustomers_account().intValue());
	}
	
	public UserExistsEntity checkIfUsernameExists(String username) {
		UserExistsEntity uee = new UserExistsEntity();
		AccountEntity newAcc = accountRepository.findByUsername(username);
		if(newAcc == null) {
				uee.setUserExists("0");
				return uee;
		}
		return uee;
	}
	
	public ResponseEntity<List<AccountEntity>> getAllUsers() {
		List<AccountEntity> accounts = new ArrayList<>();
		accountRepository.findAll().forEach(accounts :: add);
		HttpHeaders header = new HttpHeaders();
		header.add("Access-Control-Allow-Origin","*");
		return new ResponseEntity<>(accounts, header, HttpStatus.OK);
	}
	
	private void converter(AccountFormFields accountFormFields, AccountEntity accountEntity) {
		accountEntity.setUsername(accountFormFields.getUsername());
		accountEntity.setPassword(accountFormFields.getPassword());
		accountEntity.setAccountType(accountFormFields.getAccountType().toString());
		accountEntity.setBalance(accountFormFields.getBalance());
		accountEntity.setDob(accountFormFields.getDob());
		accountEntity.setEmail(accountFormFields.getEmail());
		accountEntity.setFirstName(accountFormFields.getFirstName());
		accountEntity.setHomeAddress(accountFormFields.getHomeAddress());
		accountEntity.setLastName(accountFormFields.getLastName());
		accountEntity.setMailingAddress(accountFormFields.getMailingAddress());
		accountEntity.setMobileNumber(accountFormFields.getMobileNumber());
		accountEntity.setSsn(accountFormFields.getSsn());
		
	}
	
	public AccountDetails saveNewAccount(AccountFormFields fields) {
		AccountEntity accountEntity = new AccountEntity();
		converter(fields, accountEntity);
		return new AccountDetails((accountRepository.save(accountEntity)).getIdcustomers_account().intValue());
	}
	
}
