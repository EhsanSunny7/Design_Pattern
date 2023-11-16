/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_LAB4.Chain_of_Responsibility.FilesHandler;

/**
 *
 * @author FA20-BSE-068
 */
public abstract class BaseHandler implements Handler{
	protected Handler next;
	@Override
	public void setNext(Handler next) {
		this.next = next;
		
	}
	
}