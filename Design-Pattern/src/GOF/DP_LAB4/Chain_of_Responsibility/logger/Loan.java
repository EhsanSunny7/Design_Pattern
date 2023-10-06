/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_LAB4.Chain_of_Responsibility.logger;

/**
 *
 * @author FA20-BSE-068
 */
public class Loan {
	private final String number;
	private final double amount;
	private final String purpose;
	public Loan(String number, double amount, String purpose) {
		this.number = number;
		this.amount = amount;
		this.purpose = purpose;
	}
	public String getNumber() {
		return number;
	}
	public double getAmount() {
		return amount;
	}
	public String getPurpose() {
		return purpose;
	}
	@Override
	public String toString() {
		return "Loan [number=" + number + ", amount=" + amount + ", purpose=" + purpose + "]";
	}
	
}