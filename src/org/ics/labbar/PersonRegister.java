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
		for(Person tmp:person) {
			if (tmp.getPnbr().equals(pNbr)) {
				person.remove(tmp);
				return tmp;
			}
		}
		return null;
	}
}
