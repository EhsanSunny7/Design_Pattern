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
public class File {
	private String name;
	private String path;
	private Type type;
	public File(String name, String path, Type type) {
		this.name = name;
		this.path = path;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public String getPath() {
		return path;
	}
	public Type getType() {
		return type;
	}
	
	
}