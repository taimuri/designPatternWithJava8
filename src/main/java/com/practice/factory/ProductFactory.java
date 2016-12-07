package com.practice.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ProductFactory {

	static Map<String, Supplier<Product>> products = new HashMap<>();

	static {
		products.put("loan", Loan::new);
		products.put("stock", Stock::new);
		products.put("bond", Bond::new);
	}

	public static Product createProduct(String name) {
		Supplier<Product> product = products.get(name);
		if (product != null)
			return product.get();
		else
			throw new IllegalArgumentException();
	}

	/*public static Product createProduct(String name) {
		switch (name) {
		case "loan":
			return new Loan();
		case "bond":
			return new Bond();
		case "stock":
			return new Stock();
		default:
			throw new IllegalArgumentException();
	}
}*/
}
