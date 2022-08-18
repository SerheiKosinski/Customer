package ñustomer;

import java.util.ArrayList;
import java.util.List;

   public class Logic {
	  public boolean sortCard(Customer client) {
		int num = client.getCreditCard();
		if (num > 999345000) {
			return false;
		}
		return true;
	}

	public List<Customer> listCard(List<Customer> client) {
		List<Customer> result = new ArrayList<Customer>();
		for (Customer c : client) {
			if (sortCard(c)) {
				result.add(c);
			}
		}
		return result;
	}

}
