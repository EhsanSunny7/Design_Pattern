/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_LAB4.Chain_of_Responsibility.logger.ChainLab;

/**
 *
 * @author FA20-BSE-068
 */
public class Demo {

	public static void main(String[] args) {
		Currency amount = new Currency(200);
		DispenserChain chain = new DispenserChain();
		chain.dispense(amount);

	}

}