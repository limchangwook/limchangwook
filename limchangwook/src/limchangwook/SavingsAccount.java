package limchangwook;

public class SavingsAccount extends Account implements Valuable {
	private double interest;
	private int totalTerm;
	
	public SavingsAccount (double balance,double interest){
		super(balance);
		this.interest=interest;
		this.totalTerm = 0;
	}
	
	@Override public double credit(double money) {
		if(totalTerm >= 12) {
			return super.credit(money);
		}
		return 0.0;
	}

	@Override public double getWithdrawableAmount(){
		return (totalTerm>=12) ? getBalance() : 0.0;
	}
	
	@Override public void passTime(int term){
		if(totalTerm < 12 && totalTerm + term >= 12) {
			setBalance( getBalance()*(Math.pow(1+interest, totalTerm)));
		}
		totalTerm+=term;
	}

	@Override
	public double EstimateValue(int month) {
		setBalance( getBalance()*(Math.pow(1+interest, month)));
		
		return getBalance();
	}
	public String toString(){
		return String.format("SavingsAccount_Balance: %f",getBalance());
}
}
