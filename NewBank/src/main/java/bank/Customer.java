package bank;

import java.util.ArrayList;

public class Customer {
	String name;
	int id;
	ArrayList<Integer> accounts;
	
	public static void main(String[] args) {
		
	}
	
	//getter and setter
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setID(int id) {
		this.id = id;
	}
	public Integer getID() {
		return this.id;
	}
}
