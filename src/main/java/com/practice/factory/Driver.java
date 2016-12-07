package com.practice.factory;

import java.util.function.Supplier;

public class Driver {

	Product p = ProductFactory.createProduct("loan");

	Supplier<Product> loanSupplier = Loan::new;
	Product loan = loanSupplier.get();
}
