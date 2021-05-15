package com.abhishekit.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abhishekit.entity.Account;


public interface TransferRepo extends CrudRepository<Account, Serializable>{
	
	

}
