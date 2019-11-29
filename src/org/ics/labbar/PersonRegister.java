package org.ics.labbar;

import java.util.ArrayList;


	public class PersonRegister {
		ArrayList<Person> person = new ArrayList<Person>();
	
	public void setPerson(ArrayList<Person> newLista) {
		person=newLista;
	}
	
	public ArrayList<Person> getPerson() {
		return person;
	}
	public void addPerson(Person p) {
		person.add(p);

	}
	
	public Person findPerson(String pNbr) {
		for(Person tmp: person) {
			if(tmp.getPnbr().equals(pNbr)) {
				return tmp;
			}
		}
		 return null;
	}
		
	public Person removePerson(String pNbr) {
		
			Person tmp = findPerson(pNbr);
			person.remove(tmp);
			return tmp;
			
	}

	public ArrayList<Account> findPersonAccounts(String pnbr) {
		for (Person p: this.person) {
				if(p.getPnbr().equals(pnbr)){
					return p.getAccount();
				
					
				}
				
				
			}
			
		
		return null;
	}
}
