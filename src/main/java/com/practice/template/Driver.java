package com.practice.template;

public class Driver {

	public static void main(String[] args) {
		new OnlineBanking().processCustomer(123, 
				(Customer c) -> System.out.println("Making " + c.name + " happy!"));
	}
}
