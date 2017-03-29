package limchangwook;

import java.util.Scanner;

public class AccountTest {
	public static void main(String [] args)
	{
		Account Ac1=new CheckingAccount(100.0,150.0,0.01,0.07);
		Account Ac2=new SavingsAccount(100.0,0.05);
		Scanner scan =new Scanner(System.in);
		
		double amount = 0;
		String x;
		System.out.printf("account1 balance: $ %.2f\t현재출금가능액%.2f\n",Ac1.getBalance(),Ac1.getWithdrawableAccount());
		System.out.print("Enter deposit amount for Amount for Account1: ");
		amount=scan.nextDouble();
		x=Ac1.debit(amount);
		System.out.printf("account1 balance: $ %.2f\t현재출금가능액%.2f\n",Ac1.getBalance(),Ac1.getWithdrawableAccount());
		if(((CheckingAccount)Ac1).isBankrupted()==true){
			System.out.println("파산");
		}
		Ac1.passTime(1);
		System.out.printf("account1 balance: $ %.2f\t현재출금가능액%.2f\n",Ac1.getBalance(),Ac1.getWithdrawableAccount());
		if(((CheckingAccount)Ac1).isBankrupted()==true){
			System.out.println("파산");
		}
		
		Ac1.passTime(5);
		System.out.printf("account1 balance: $ %.2f\t현재출금가능액%.2f\n",Ac1.getBalance(),Ac1.getWithdrawableAccount());
		if(((CheckingAccount)Ac1).isBankrupted()==true){
			System.out.println("파산");
		}
		System.out.println();
		System.out.printf("account2 balance: $ %.2f\t현재출금가능액%.2f\n",Ac2.getBalance(),Ac2.getWithdrawableAccount());
		System.out.println("6 Month later!");
		Ac2.passTime(6);
		System.out.printf("account2 balance: $ %.2f\t현재출금가능액%.2f\n",Ac2.getBalance(),Ac2.getWithdrawableAccount());
		Ac2.debit(50.0);
		System.out.println("next 6 Month later!");
		Ac2.passTime(6);
		System.out.printf("account2 balance: $ %.2f\t현재출금가능액%.2f\n",Ac2.getBalance(),Ac2.getWithdrawableAccount());
		
		System.out.println("next 1 Month later!");
		Ac2.passTime(1);
		System.out.printf("account2 balance: $ %.2f\t현재출금가능액%.2f\n",Ac2.getBalance(),Ac2.getWithdrawableAccount());
		Ac2.debit(50.0);
		System.out.printf("account2 balance: $ %.2f\t현재출금가능액%.2f\n",Ac2.getBalance(),Ac2.getWithdrawableAccount());
	}
	
}
