package Application;

import Entities.Account;
import Entities.BusinessAccount;
import Entities.SavingsAccount;

public class Program2 {

	public static void main(String[] args) {
		Account acc = new Account(2345, "Antonio", 1000.00);
		acc.withdraw(200.00);
		System.out.println(acc.getBalance());
		
		Account acc2 = new SavingsAccount(3343443, "Jose", 1000.00, 0.01);
		acc2.withdraw(200.00);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(121221, "Jose S.A", 1000.00, 500.00);
		acc3.withdraw(200.00);
		System.out.println(acc3.getBalance());
		

	}

}
