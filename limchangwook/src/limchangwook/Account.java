package limchangwook;

public abstract class Account {
	private double balance;
	
	public abstract double getWithdrawableAmount();
	public abstract void passTime(int term );
	public double credit(double adds) {
		if(adds >= 0) {
			balance=balance+adds;
			return adds;
		}
		return 0;
	}
	public double debit(double withdraws) {
		if(withdraws > 0 && withdraws <= getWithdrawableAmount()){
			balance = balance - withdraws;
			return withdraws;
		}
		return 0;
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