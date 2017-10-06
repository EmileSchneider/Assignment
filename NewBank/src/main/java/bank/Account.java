package bank;

import java.util.ArrayList;
import bank.*;

public class Account {

	String name;
	int id;
	long balance;
	ArrayList<Integer> customers;
	
	public static void main(String[] args) {
		
	}
	
	//account management
	public void addCustomer(Customer customer) {
		customers.add(customer.getID());
	}
	public void removeCustomer(Customer customer) {
		customers.remove(customer.getID());
	}
	
	//account running
	public void deposit(long amount) {
		this.balance = this.balance + amount;
	}
	
	public void withdraw(long amount) {
		this.balance = this.balance - amount;
	}
	
	
	// getter and setter
	public int getID() {
		return this.id;
	}
	public void setID(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
