package com.abhishekit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abhishekit.entity.Account;
import com.abhishekit.repository.TransferRepo;

@Service
public class TransferService {
	
	@Autowired
	private TransferRepo repo;

	@Transactional
	public void transferMoney(int a, int b, double d)  {
		
		Optional<Account> acEnt = repo.findById(a);
		
		Account account = acEnt.get();
		
		double changedBalance = account.getTotalBalance() - d;
		
		account.setTotalBalance(changedBalance);
		
		repo.save(account);
		
		Optional<Account> bcEnt = repo.findById(b);
		

		
		Account accountB = bcEnt.get();
		
	   double changedBalanceB = accountB.getTotalBalance() + d;
		
		accountB.setTotalBalance(changedBalanceB);
		repo.save(null);
		
		//return "success";
		
		//double changedAmount = acEnt.total
		
		
	}
	
	
	
}
