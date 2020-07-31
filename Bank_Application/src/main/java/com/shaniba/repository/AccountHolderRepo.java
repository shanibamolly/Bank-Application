package com.shaniba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.shaniba.model.AccountHolder;

public interface AccountHolderRepo extends JpaRepository<AccountHolder, Integer> 
{
	@Transactional
	@Modifying
	@Query("update AccountHolder set balance=?1 where accountNo=?2")
	Integer updatebalance(int balance,int accountNo);
	
}
