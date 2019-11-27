package org.ics.labbar;

public class Account {

	private String nbr;
	private double balance;
	private Person person;
	
	
	public Account(String nbr2, double balance2) {
		// TODO Auto-generated constructor stub
	}

	public Account(double xBalance, String cnbr) {
		// TODO Auto-generated constructor stub
	}

	public void setPerson(Person person) {
		this.person=person;
	}

	public Person getPerson() {
		return person;
	}
	
	public void setNbr(String nbr) {
		this.nbr=nbr;
	}
	public String getNbr() {
		return nbr;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void credit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		balance=balance - amount;
	}

	public void add(Account a) {
		// TODO Auto-generated method stub
		
	}
}
