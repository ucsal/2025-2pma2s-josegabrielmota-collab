package br.com.mariojp.solid.srp;

public class TaxCalculator {
	public double calculate(Double subtotal) {
		double rate = Double.parseDouble(System.getProperty("tax.rate"));
		double taxRate = subtotal * rate;
		return taxRate;
	}

}
