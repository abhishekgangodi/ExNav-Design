package com.abhishekit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table
@Entity(name="account")
@Data
public class Account {
	
	@Column(name="name")
	String name;
	
	@Id
	@Column(name="account_no")
	Integer accountNo;
	
	@Column(name="total_balance")
	Double totalBalance;
	

}
