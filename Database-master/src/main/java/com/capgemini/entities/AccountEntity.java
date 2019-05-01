package com.capgemini.entities;

import com.capgemini.beans.AccountType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers_account")
public class AccountEntity {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idcustomers_account;
	private String username;
	private String firstName;
	private String lastName;
	private String dob;
	private String ssn;
	private String email;
	private String mobileNumber;
	private String homeAddress;
	private String mailingAddress;
	private String accountType;
	private double balance;
	private String password;
	
	public Long getIdcustomers_account() {
		return idcustomers_account;
	}

	public void setIdcustomers_account(Long idcustomers_account) {
		this.idcustomers_account = idcustomers_account;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "AccountEntity [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", ssn=" + ssn
				+ ", email=" + email + ", mobileNumber=" + mobileNumber + ", homeAddress=" + homeAddress
				+ ", mailingAddress=" + mailingAddress + ", accountType=" + accountType + ", balance=" + balance + "]";
	}
}
