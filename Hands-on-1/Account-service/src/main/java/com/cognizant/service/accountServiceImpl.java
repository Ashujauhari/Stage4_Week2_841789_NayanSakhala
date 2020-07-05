package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cognizant.model.Account;

@Repository
public class accountServiceImpl implements accountService{

	@Override
	public Account getAccount(String number) {
		List<Account> list=new ArrayList<>();
		Account acc1=new Account("03133142455","Current",2500000);
		list.add(acc1);
		return acc1;
	}

}
