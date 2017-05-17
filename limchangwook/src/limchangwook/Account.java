package limchangwook;

import java.util.*;
public abstract class Account {
	private double balance;
	
	public abstract double getWithdrawableAccount();
	public abstract void passTime(int term );
	public abstract void passTime();
	public double credit(double adds) {
		if(adds >= 0) {
			balance=balance+adds;
			return adds;
		}
		return 0;
	}
	public void debit(double withdraws) throws Exception{
			balance=balance - withdraws;
	}
	public double getBalance() {
		return balance;
	}
	
	protected void setBalance(double balance){
		this.balance= balance;
	}
	public static double sumForAccount(ArrayList<Account> list){
		double sum=0;
		for(Account acc1 : list){
			sum+= acc1.getBalance();
		}
		return sum;
	}
	public static void passTimeForList(ArrayList<Account>list,int month){
		for(Account acc2 : list){
			acc2.passTime(month);
		}
	}
	public Account(double money)
	{
		this.balance=money;
	}
}