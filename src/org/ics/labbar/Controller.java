package org.ics.labbar;
import java.util.ArrayList;
import javax.swing.JFrame;
public class Controller {

	PersonRegister persons;
	JFrame personFrame;
	Person person; 
	Account account;
	
	public Controller(PersonRegister personreg, JFrame personFrame) {
		this.persons=personreg;
		this.personFrame=personFrame;
		
	}
	
	public void addPerson(String pnbr, String name) {
		Person p= new Person(pnbr,name);
		persons.addPerson(p);
		
	}
	
	public void addPerson(String pnbr, String name, String nbr) {
		Person tmpPerson = new Person(pnbr, name);
		Account account = new Account(0, nbr);
		tmpPerson.addAccount(account);
		account.setPerson(tmpPerson);
		persons.addPerson(tmpPerson);
		
	}
	
	public void removePerson(String pnbrRemove) {
		persons.removePerson(pnbrRemove);
		
	}

	
	public Person findPerson (String pnbr) {
		Person tmp = persons.findPerson(pnbr);
		if(tmp.getPnbr().equals(pnbr)) {
			return tmp;
		}
	
	 return null;
	}

		public void addAccount(Account a, Person p) {
			p.addAccount(a);
			a.setPerson(p);
		}
	
		public void credit(double amount, String pnbr, String nbr) {
			Account tmp = findSpecificAccount(pnbr, nbr);
			if (tmp != null) {
				tmp.credit(amount); {
					
				}
			}
			
		}
	
		public void withdraw(double amount, String pnbr, String nbr) {
			Account tmp = findSpecificAccount(pnbr, nbr); 
			if (tmp != null) {
				tmp.withdraw(amount);
			}
		}
		public ArrayList<Account> findPersonAccounts(String pnbr) {
			return persons.findPersonAccounts(pnbr);
		}
	
		public void setOwner(Person p) {
		
		}
		
		public Account findSpecificAccount(String pnbr, String nbr) {
			ArrayList<Account> tmpList = persons.findPersonAccounts(pnbr);
			if (tmpList != null ) {
				for (Account a: tmpList) {
					if (a.getNbr().equals(nbr)) {
						return a;
					}
				}
				
			}
			return null;
			
		}
	
		
}






