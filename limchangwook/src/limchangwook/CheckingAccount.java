package limchangwook;

public class CheckingAccount extends Account implements Valuable {
	private double credit_limit;
	private double interest;
	private double loan_interest;
	public CheckingAccount(double balance,double credit_limit,double interest,double loan_interest) {
		super(balance);
		this.credit_limit=credit_limit;
		this.interest=interest;
		this.loan_interest=loan_interest;
	}
	@Override public double getWithdrawableAmount(){
		if(getBalance()+50.00<0)
		{
			return 0;
		}
		return this.getBalance()+50.00; 
		
	}
	
	@Override public void debit(double withdraws)throws Exception{
		if(withdraws<0){
			throw new Exception("음수입력!\n");
		} else if(this.getWithdrawableAmount() < withdraws) {
			throw new Exception("한도초과\n");
		} else{ 
			 
		setBalance(getBalance()-withdraws);
		}
	}
		
	@Override public void passTime(int term){
			
		 setBalance(getBalance()*(Math.pow(1+interest, term)));
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
		passTime(6);
		return getBalance()+getBalance()*interest;
	}
	public String toString(){
			return String.format("CheckingAccount_Balance: %f",getBalance());
	}
	}
	
	
	
