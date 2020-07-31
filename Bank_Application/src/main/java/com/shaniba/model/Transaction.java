package com.shaniba.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaction 
{
	@Id
	private int transactionId;
	private int transactionAmount;
	private int balance;
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(int transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
