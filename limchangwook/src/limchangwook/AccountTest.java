package limchangwook;

import java.util.Scanner;

public class AccountTest {
	public static void main(String [] args)
	{
		CheckingAccount Ac1=new CheckingAccount(100.0,1000.0,0.01,0.07);
		CheckingAccount Ac2=new CheckingAccount(100.0,1000.0,0.01,0.07);
		System.out.println("account1 balance: "+"$"+Ac1.getBalance());
		System.out.println("account1 balance: "+"$"+Ac2.getBalance());
		
		System.out.print("Enter deposit amount for Amount for Account1: ");
		Scanner input =new Scanner(System.in);
		double deposit1=input.nextDouble();
		double x=deposit1;
		Ac1.credit(x);
		System.out.println("account1 balance: "+"$"+Ac1.getBalance());
		System.out.println("account1 balance: "+"$"+Ac2.getBalance());
		
		System.out.print("Enter withdrawal amount for account2: ");
		double withdrawal2=input.nextDouble();
		double y=withdrawal2;
		Ac2.debit(y);
		System.out.println("account1 balance: "+"$"+Ac1.getBalance());
		System.out.println("account1 balance: "+"$"+Ac2.getBalance());
		
		System.out.println("next month!");
		Ac1.nextMonth();
		Ac2.nextMonth();
		System.out.println("account1 balance: "+"$"+Ac1.getBalance());
		System.out.println("account1 balance: "+"$"+Ac2.getBalance());
	}
}
