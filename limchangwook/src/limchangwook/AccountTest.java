package limchangwook;

import java.util.Scanner;

public class AccountTest {
	public static void main(String [] args)
	{
		Account Ac1=new Account(50.0);
		Account Ac2=new Account(0.0);
		System.out.println("account1 balance: "+"$"+Ac1.getBalance());
		System.out.println("account1 balance: "+"$"+Ac2.getBalance());
		
		System.out.print("Enter withdrawal amount for account1: ");
		Scanner input =new Scanner(System.in);
		double withdrawal1=input.nextDouble();
		double x=withdrawal1;
		
		System.out.printf("subtracting %f from account1 balance\n",withdrawal1);
		String err = Ac1.debit(x);
		if(err != null) {
			System.err.println(err);
		}
		System.out.println("account1 balance: "+"$"+Ac1.getBalance());
		System.out.println("account1 balance: "+"$"+Ac2.getBalance());
		
		System.out.print("Enter withdrawal amount for account2: ");
		double withdrawal2=input.nextDouble();
		double y=withdrawal2;
		System.out.printf("subtracting %f from account1 balance\n",withdrawal2);
		Ac2.debit(y);
		System.out.println("account1 balance: "+"$"+Ac1.getBalance());
		System.out.println("account1 balance: "+"$"+Ac2.getBalance());
	}
}
