package com.capgemini.services;

import org.springframework.stereotype.Service;

import com.capgemini.beans.AccountFormFields;
import com.capgemini.beans.AccountType;
import com.capgemini.exception.AccountValidationException;

@Service
public class AccountValidation {
	
	public String accountFormFieldsValidate(AccountFormFields accountFormFields) throws AccountValidationException {
		
		if (null == accountFormFields.getAccountType() || (accountFormFields.getAccountType() == AccountType.SAVINGS
				&& accountFormFields.getBalance() < 200.0)) throw new AccountValidationException("low balance");
		if (null == accountFormFields.getAccountType() || (accountFormFields.getAccountType() == AccountType.CHECKING
				&& accountFormFields.getBalance() < 300.0)) throw new AccountValidationException("low balance");
		if (null == accountFormFields.getAccountType() || (accountFormFields.getAccountType() == AccountType.CD
				&& accountFormFields.getBalance() < 2000.0)) throw new AccountValidationException("low balance");
		if (null == accountFormFields.getDob() || !accountFormFields.getDob().matches("\\d{2}-\\d{2}-\\d{4}"))
			throw new AccountValidationException("date of birth is not correct");
		if (null == accountFormFields.getEmail() || !accountFormFields.getEmail().contains("@"))
			throw new AccountValidationException("email is not correct");
		if (null == accountFormFields.getFirstName() || accountFormFields.getFirstName().startsWith("[A-Z]"))
			throw new AccountValidationException("first name is not correct");
		if (null == accountFormFields.getLastName() || accountFormFields.getLastName().startsWith("[A-Z]"))
			throw new AccountValidationException("Last name is not correct");
		if (null == accountFormFields.getMailingAddress() || accountFormFields.getMailingAddress().startsWith("[0-9]"))
			throw new AccountValidationException("Mailing address name is not correct");
		if (null == accountFormFields.getHomeAddress() || accountFormFields.getHomeAddress().startsWith("[0-9]"))
			throw new AccountValidationException("Home address name is not correct");
		if (null == accountFormFields.getMobileNumber() || accountFormFields.getMobileNumber().startsWith("[0-9]"))
			throw new AccountValidationException("Mobile # is not correct");
		if (null == accountFormFields.getSsn() || accountFormFields.getSsn().startsWith("[0-9]"))
			throw new AccountValidationException("SSN # is not correct");
		
		return "success";
		
	}
	
}