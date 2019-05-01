package com.capgemini.beans;

public class AccountDetails {
	private int accountNumber;

	
	public AccountDetails(int accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
}
