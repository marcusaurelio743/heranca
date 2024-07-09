package Application;

import Entities.Account;
import Entities.BusinessAccount;
import Entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1002, "Marcus", 0.00);
		BusinessAccount bc = new BusinessAccount(1003, "Maria", 0.00, 500.00);
		
		//upcasting
		Account acc2 = bc;
		Account acc3 = new BusinessAccount(1004, "jose", 0.00, 1000.00);
		Account acc4 = new SavingsAccount(1006, "ana", 0.00, 0.01);
		
		//downcasting
		
		BusinessAccount acc5 = (BusinessAccount) acc3;
		acc5.loan(100.00);
		
		//BusinessAccount acc6 = (BusinessAccount) acc4;
		
		if(acc4 instanceof BusinessAccount) {
			BusinessAccount acc6 = (BusinessAccount) acc4;
			acc6.loan(500.00);
			System.out.println("load!!");
		}
		if(acc4 instanceof SavingsAccount) {
			SavingsAccount acc8 = (SavingsAccount) acc4;
			acc8.updateBalance();
			System.out.println("update");
		}

	}

}
