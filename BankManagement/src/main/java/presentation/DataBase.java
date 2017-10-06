package presentation;

import java.util.*;
import bankmanagement.*;

public class DataBase {
	
	Map<Integer, Account> accountDB = new HashMap<>();
	Map<Integer, Customer> customerDB = new HashMap<>();
	
	public static void main(String[] args) {
		
	}
	public void addNewCustomer(String name) {
		Customer cust2add = new Customer();
		cust2add.setName(name);
		cust2add.setID(name.hashCode());
		customerDB.put(cust2add.getID(), cust2add);
	}
	public void addNewAccount(String name) {
		Account acc2add = new Account();
		acc2add.setName(name);
		acc2add.setID(name.hashCode());
		accountDB.put(acc2add.getID(), acc2add);
	}
	public void getAccountByName(String name) {
		
	}
	public static String showAllAccounts() {
		accountDB.forEach(System.out.println(accounts));
	}
}
