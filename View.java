package ñustomer;

import java.util.List;

public class View {
	public void printCard(List<Customer> client) {
		System.out.println("list of customers with a lower credit card number:");
		for (Customer b : client) {
			System.out.println( b.getId()+b.getSurname()+b.getName()+b.getPatronymic()+b.getAddress()+b.getCreditCard()+b.getAccountNumber());
			
		}
	}
	
	
			
	public void printSort(List<Customer> client) {
		System.out.println("list of buyers in alphabetical order:");
		for (Customer b : client) {
			System.out.println(b.getId()+b.getSurname()+b.getName()+b.getPatronymic()+b.getAddress()+b.getCreditCard()+b.getAccountNumber());

		}
	}

}
