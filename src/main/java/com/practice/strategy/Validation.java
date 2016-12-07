package com.practice.strategy;

public class Validation implements ValidationStrategy {

	private ValidationStrategy strategy;

	public Validation(ValidationStrategy strategy) {
		this.strategy = strategy;
	}

	public boolean execute(String s) {
		return strategy.execute(s);
	}

	public static void main(String[] args) {
		Validation v1 = new Validation(new IsAllLowerCase());
		System.out.println(v1.execute("taTimur"));

		Validation v2 = new Validation(new IsNumeric());
		System.out.println(v2.execute("123s"));

		Validation v3 = new Validation((String s) -> s.matches("\\d+"));
		System.out.println(v3.execute("213"));
	}
}
