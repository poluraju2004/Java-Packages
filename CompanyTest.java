package com.companys;
import com.company.accounts.*; //import com.company.accounts.Accounts;

import com.example.hr.Employees; //import com.company.hr.*

public class CompanyTest {
	

	public static void main(String[] args) {
		Accounts a = new Accounts();
		a.accountsDetails();
		
		Employees e = new Employees();
		e.emplyoessDisp();

	}

}
