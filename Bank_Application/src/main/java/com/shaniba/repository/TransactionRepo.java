package com.shaniba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shaniba.model.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, Integer> 
{
	@Query(nativeQuery = true,value="SELECT * FROM Transaction h ORDER BY h.transaction_id DESC LIMIT 0,5")
	Iterable<Transaction> findByTop(); 
}
