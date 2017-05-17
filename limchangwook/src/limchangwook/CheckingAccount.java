package limchangwook;

public class CheckingAccount extends Account implements Valuable {
	private double credit_limit;
	private double interest;
	private double loan_interest;
	int total_term;
	public CheckingAccount(double balance,double credit_limit,double interest,double loan_interest) {
		super(balance);
		this.credit_limit=credit_limit;
		this.interest=interest;
		this.loan_interest=loan_interest;
	}
	@Override public double getWithdrawableAccount(){
		if(getBalance()+50.00<0)
		{
			return 0;
		}
		return this.getBalance()+50.00; 
		
	}
	
	@Override public void debit(double withdraws)throws Exception{
		if(withdraws<0){
			throw new Exception("음수입력!\n");
		} else if(this.getWithdrawableAccount() < withdraws) {
			throw new Exception("한도초과\n");
		} else{ 
			 
		setBalance(getBalance()-withdraws);
		}
	}
		
	@Override public void passTime(int term){
		if(getBalance()>0){
		 setBalance(getBalance()+(getBalance()*(interest*term)));
		}
		else{
			setBalance(getBalance()+(getBalance()*(loan_interest*term)));
		}
	}
	@Override public void passTime(){
		
		 setBalance(getBalance()*(Math.pow(1+interest, 1)));
	}
	public boolean isBankrupted(){
		if(getBalance()+50.00<0){
			return true;
		}
		else {
			return false;
		}
	}
	public void nextMonth(){
		if(getBalance()>0.0){
			setBalance(getBalance()+getBalance()*this.interest);
		}
		else{
			setBalance(getBalance()+getBalance()*this.loan_interest);
			
		}
	}
	@Override
	public double EstimateValue(int month) {
		return getBalance()+getBalance()*interest*month;
	}
	@Override
	public double EstimateValue() {
		return getBalance()+getBalance()*interest;
	}
	public String toString(){
			return String.format("CheckingAccount_Balance: %f",getBalance());
	}
	}
	
	
	
