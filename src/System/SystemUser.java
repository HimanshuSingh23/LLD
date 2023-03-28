package System;

import LIBRARY.Person;

public class SystemUser extends Person{
	
	String Email;
	String phoneNumber;
	Account account;
	
	 public SystemUser(String firstName, String lastName, String email, String phoneNumber, Account account) {
	        super(firstName, lastName);
	        this.Email = email;
	        this.phoneNumber = phoneNumber;
	        this.account = account;
	    }

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	 
	 
	
	

}
