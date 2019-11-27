package org.ics.labbar;
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
	
	public void addPerson(String personnr, String newName, double xBalance, String Cnbr) {
		Person p = new Person(personnr,newName); 
		Account account = new Account(xBalance, Cnbr);
		p.setAccount(account);
		Person.setPnbr(p);
		p.getPnbr().setAccount(account);
		
		Person.addPerson(p);
		
		
	}

	public void removePerson(String pnbrRemove) {
		Controller p = null;
		p.removePerson(pnbrRemove);
		
	}

	public String[]findPerson(String pnbr) {
		
			
		}
	return aPers;
	}
	public void updatePersonName(String name) {
		Person.setName(name);
	}
}

