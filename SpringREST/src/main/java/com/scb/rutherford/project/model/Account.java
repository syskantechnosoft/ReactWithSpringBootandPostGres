package com.scb.rutherford.project.model;

public class Account {
	private int id;
	private int accountType;
	private String accountNumber;
	private String accountBranch;
	private float accountBalance;
	private int customerId;

	public Account() {
		super();
	}

	public Account(int id, int accountType, String accountNumber, String accountBranch, float accountBalance,
			int customerId) {
		super();
		this.id = id;
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.accountBranch = accountBranch;
		this.accountBalance = accountBalance;
		this.customerId = customerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccountType() {
		return accountType;
	}

	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountBranch() {
		return accountBranch;
	}

	public void setAccountBranch(String accountBranch) {
		this.accountBranch = accountBranch;
	}

	public float getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accountType=" + accountType + ", accountNumber=" + accountNumber
				+ ", accountBranch=" + accountBranch + ", accountBalance=" + accountBalance + ", customerId="
				+ customerId + "]";
	}

}
