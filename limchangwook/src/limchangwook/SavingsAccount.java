package limchangwook;

public class SavingsAccount extends Account {
	private double interest;
	public int totalTerm;
	
	public SavingsAccount (double balance,double interest){
		super(balance);
		this.interest=interest;
	}
	@Override public String debit(double withdraws){
		if(totalTerm<12){
			 return "아직 출금할수 없습니다\n";
		}
		else{
			setBalance(getBalance()-withdraws);
			return null;
		}
	}
	@Override public double getWithdrawableAccount(){
		return getBalance();
	}
	@Override public void passTime(int term){
		totalTerm+=term;
		if(totalTerm==12)
		{
		setBalance( getBalance()*(Math.pow(1+interest, totalTerm)));
		}
	}
}
