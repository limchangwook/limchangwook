package limchangwook;

public abstract class Account {
	private double balance;
	
	public abstract double getWithdrawableAccount();
	public abstract void passTime(int term );
	public void credit(double adds) {
		balance=balance+adds;
	}
	public String debit(double withdraws) {
		if(balance<withdraws) {
			return "Debit amount exceeded account balance";
		} else {
			balance=balance-withdraws;
			return null;
		}
	}
	public double getBalance() {
		return balance;
	}
	protected void setBalance(double balance){
		this.balance= balance;
	}
	public Account(double money)
	{
		this.balance=money;
	}
}