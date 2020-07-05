package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.cognizant.model.Loan;

@Repository
public class loanServiceImpl implements loanService{

	@Override
	public Loan getLoan(String number) {
		List<Loan> list=new ArrayList<>();
		Loan loan1=new Loan("123456789","vehicle",1000000,50000,20);
		list.add(loan1);
		return loan1;
	}

}
