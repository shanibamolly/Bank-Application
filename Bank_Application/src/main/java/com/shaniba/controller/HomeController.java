package com.shaniba.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shaniba.model.AccountHolder;
import com.shaniba.model.Transaction;
import com.shaniba.repository.AccountHolderRepo;
import com.shaniba.repository.TransactionRepo;

@Controller
public class HomeController 
{
	@Autowired
	private TransactionRepo transactionrepo;
	@Autowired
	private AccountHolderRepo accountHolderrepo;
	@RequestMapping("/")
	public String Home(Model model)
	{
		List<Transaction> tran=new ArrayList<>();// List<accno,name,balance>
		transactionrepo.findByTop().forEach(tran::add);
		model.addAttribute("tran", tran);
		return "home";
	}
	
	
	@RequestMapping("/transactionAmount")
	public String transactionAmount(AccountHolder accountHolder,Transaction transaction,@RequestParam("transactionAmount") int transactionAmount)
	{
		int temp=(int)transactionrepo.count();
		transaction.setTransactionId(temp+1);
		accountHolder=accountHolderrepo.getOne(111);
		int balance=accountHolder.getBalance()-transactionAmount;
		transaction.setBalance(balance);
		transactionrepo.save(transaction);
		accountHolderrepo.updatebalance(balance, 111);
		return "redirect:/";
	}

}
