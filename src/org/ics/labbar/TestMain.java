package org.ics.labbar;

public class TestMain {
	public static void main(String[] args) {

		PersonRegister pr = new PersonRegister();
		
		Account a1 = new Account();
		a1.setNbr("111");
		a1.setBalance(100);
		
		Account a2 = new Account();
		a2.setNbr("222");
		a2.setBalance(200);

		Account b1 = new Account();
		b1.setNbr("333");
		b1.setBalance(300);

		Account b2 = new Account();
		b2.setNbr("444");
		b2.setBalance(400);

		Person a = new Person();
		a.setName("Ida Carlsson");
		a.setPnbr("990511-5805");
		a.addAccount(a1);
		a.addAccount(a2);
		pr.addPerson(a);

		Person b = new Person();
		b.setName("Linnea Forsler");
		b.setPnbr("980101-5805");
		b.addAccount(b1);
		b.addAccount(b2);
		pr.addPerson(b);
}
}