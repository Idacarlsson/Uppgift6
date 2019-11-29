package org.ics.labbar;

import java.util.ArrayList;

public class Person {
	private String pnbr;
	private String name;
	private ArrayList<Account> account= new ArrayList<Account>();
	
	public Person(String pnbr, String name) {
		this.pnbr=pnbr;
		this.name=name;
		
	}
	
	public void setAccount(ArrayList<Account> account) {
	this.account=account;
	}
	public ArrayList<Account> getAccount() {
		return account;
	}
	public void setPnbr(String pNbr) {
		this.pnbr=pNbr;
	}
	
	public String getPnbr() {
		return pnbr;
	}
	
	public void setName(String name ) {
		this.name=name;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void addAccount(Account a) {
	account.add(a);
	}
}
// klass person med en arraylist account,
// kan adda ett account.