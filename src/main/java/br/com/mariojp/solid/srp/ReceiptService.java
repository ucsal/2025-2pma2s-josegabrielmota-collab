package br.com.mariojp.solid.srp;

public class ReceiptService {
	public String generate(Order order) {
		double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
		TaxCalculator calculator = new TaxCalculator();
		double tax = calculator.calculate(subtotal);
		double total = subtotal + tax;
		ReceiptFormatter receipt = new ReceiptFormatter();
		return receipt.format(order, tax, subtotal, total);
	}
}
