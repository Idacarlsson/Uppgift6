package org.ics.labbar;

import java.util.ArrayList;

public class Person {
	private String pnbr;
	private String name;
	private ArrayList<Account> BankAccount= new ArrayList<Account>();
	
	public void setAccount(ArrayList<Account> newLista) {
		BankAccount=newLista;
	}
	public ArrayList<Account> getAccount() {
		return BankAccount;
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
	BankAccount.add(a);
	}
}
// klass person med en arraylist account,
// kan adda ett account.