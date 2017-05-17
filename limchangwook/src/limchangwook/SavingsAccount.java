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
	@Override public void debit(double withdraws)throws Exception{
		if(withdraws<0){
			throw new Exception("음수입력!\n");
		} else if(this.getWithdrawableAccount() < withdraws) {
			throw new Exception("한도초과\n");
		}else if(totalTerm<12){
			throw new Exception("아직 출금할수 없습니다\n");
		}
			
		if(withdraws > 0 && withdraws <= getWithdrawableAccount()){
			setBalance(getBalance() - withdraws);
		}
	}

	@Override public double getWithdrawableAccount(){
		return (totalTerm>=12) ? getBalance() : 0.0;
	}
	
	@Override public void passTime(int term){
		if(totalTerm < 12 && totalTerm + term >= 12) {
			setBalance( getBalance()*(Math.pow(1+interest, totalTerm)));
		}
		totalTerm+=term;
	}
	@Override public void passTime(){
			setBalance( getBalance()*(Math.pow(1+interest, 1)));
	}
	@Override
	public double EstimateValue(int month) {
		return getBalance()*(Math.pow(1+interest, month));
	}
	@Override
	public double EstimateValue() {
		return getBalance()*(Math.pow(1+interest, 1));
	}
	public String toString(){
		return String.format("SavingsAccount_Balance: %f",getBalance());
}
}
