package bankmanagement;

import java.util.Scanner;
import bankmanagement.*;
import presentation.DataBase;

public class FrontEnd {

	public static void printAllCustomers() {
		System.out.println("Show all customers \n");
		DataBase.showAllAccounts();
		
	}
	public static void createNewCustomer() {
		
	}
	public static void findCustomer() {
		
	}
	public static void deleteCustomer() {
		
	}
	public static void deposit() {
		
	}
	public static void withdraw() {
		
	}
	public static void main(String[] args) {
		while(true) {	
			Scanner sc = new Scanner(System.in);
			String command = sc.nextLine();
			switch (command) {
			case "add Customer":
				createNewCustomer();
				break;
			case "show all Customers":
				printAllCustomers();
				break;
			case "find Customer":
				findCustomer();
				break;
			case "delete Customer":
				deleteCustomer();
				break;
			case "deposit":
				deposit();
				break;
			case "withdraw":
				withdraw();
				break;
			default:
				break;
			}
		}	
	}
}
