package limchangwook;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountTest {
	public static void main(String [] args)
	{
		Account Ac1=new CheckingAccount(100.0,50.0,0.01,0.07);
		Account Ac2=new SavingsAccount(100.0,0.05);
		Scanner scan =new Scanner(System.in);
		double amount;
		try{
			System.out.println("Enter deposit amount for Account1: ");
			amount=scan.nextDouble();
			Ac1.debit(amount);
			System.out.println("Account1 balance: $"+Ac1.getBalance());
			
			System.out.println("Enter deposit amount for Account2: ");
			amount=scan.nextDouble();
			Ac2.debit(amount);
			System.out.println("Account1 balance: $"+Ac1.getBalance());
		}catch(InputMismatchException e){
			System.out.println("예외발생: 숫자를 입력하세요\n"+e.toString());
		}catch(Exception e){
			System.out.println("예외발생 "+e.toString());
		}finally{
			Ac1.passTime(2);
			System.out.println("2month later account1: "+Ac1.getBalance());
		}
		}
}
