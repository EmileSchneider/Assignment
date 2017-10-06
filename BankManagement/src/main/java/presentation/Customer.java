package presentation;

import java.util.ArrayList;




public class Customer {
	String name;
	int ID;
	ArrayList<Integer> accounts;
	
	public static void main(String[] args) {
		
	}
	public void addAccount(Account acc) {
		accounts.add(acc.getID());
	}
	public void delAccount(Account acc) {
		accounts.remove(acc.getID());
	}
	//get'ers and set'ers 
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public int getID() {
		return this.ID;
	}
}
