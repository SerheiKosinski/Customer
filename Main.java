package ñustomer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		List<Customer> visitor = new ArrayList<Customer>();
		
		visitor.add (new Customer(111," Dobrov"," Dmitriy"," Ivanovich"," Lesnaya 8",0, "984684444"));
		visitor.add (new Customer(222," Ivanov"," Denis"," Denisovich"," Starovilenskaya 22",0, "899266616"));
		visitor.add (new Customer(333," Sidorov"," Piter"," Petrovich"," Stroitelei 78",0, "984875151"));
		
		Logic logi = new Logic();
		List<Customer> result = logi.listCard(visitor);
		View prin = new View();
		prin.printCard(result);
		
		Collections.sort(visitor);
		View prin1 = new View();
		prin1.printSort(visitor);
		
	}

}