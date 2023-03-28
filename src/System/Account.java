package System;

public class Account {
	
	private String userName;
	private String password;
	private int accountId;
	
	public Account(String userName, String password, int accountId) {
		this.userName = userName;
		this.password = password;
		this.accountId = accountId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	
	
	

}
