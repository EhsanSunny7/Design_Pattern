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
public interface Approver {
	void setNext(Approver next);
	void process(Loan loan);
}