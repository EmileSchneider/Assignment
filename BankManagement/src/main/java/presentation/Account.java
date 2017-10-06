package presentation;

import java.util.ArrayList;

public class Account {
    
	long balance;
	String name;
	int ID;
	ArrayList<Integer> accountUsers;
	
	
	public static void main(String[] args) {
    	
    }
	
	public void deposit(long amount) {
		this.balance = this.balance + amount;
	}
	public void withdraw(long amount) {
		this.balance = this.balance - amount;
	}
	
	public void addAccount(Customer cum) {
		accountUsers.add(cum.getID());
	}
	public void delAccount(Account acc) {
		accountUsers.remove(acc.getID());
	}
	
	//setters and getters for variables fo the account
	public void setBalance(long amount) {
		this.balance = amount;
	}
	public long getBalance() {
		return this.balance;
	}
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
