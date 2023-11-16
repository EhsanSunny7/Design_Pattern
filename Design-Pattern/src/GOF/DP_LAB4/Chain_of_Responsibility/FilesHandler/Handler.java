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
public interface Handler {
	void setNext(Handler next);
	void handle(File file);
	String getName();
}
