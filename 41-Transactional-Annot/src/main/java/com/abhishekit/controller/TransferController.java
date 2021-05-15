package com.abhishekit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhishekit.service.TransferService;

@RestController

public class TransferController {

	@Autowired
	private TransferService service;
	
	@GetMapping("/transfer")
	public void transfer()
	{
		//String result = 
				
				service.transferMoney(001, 002, 10.0);
		//if(result == "success")
		{	
		//return "pass";
		}
		//else
		{
		//	return "fail";
		}	
	}
	
	
	
}
