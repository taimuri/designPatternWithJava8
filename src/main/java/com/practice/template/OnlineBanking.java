package com.practice.template;

import java.util.function.Consumer;

/**
 * Template Method pattern
 * @author tmirza
 *
 */
public abstract class OnlineBanking {

	public void processCustomer(int id, Consumer<Customer> makeCustomerHappy) {
		Customer c = findCustomer(id);
		makeCustomerHappy.accept(c);
	}
	
	private Customer findCustomer(int id) {
		return new Customer();
	}

	/*abstract void makeCustomerHappy(Customer c);*/
}
