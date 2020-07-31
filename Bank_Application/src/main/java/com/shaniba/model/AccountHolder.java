package com.shaniba.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountHolder 
{
	@Id
	private int accountNo;
	private String name;
	private int balance;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
