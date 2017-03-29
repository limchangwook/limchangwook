package limchangwook;

public class CheckingAccount extends Account {
	private double credit_limit;
	private double interest;
	private double loan_interest;
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
	
	@Override public String debit(double withdraws){
		if(credit_limit<=withdraws){
			return "too much";
		}
		else{
			this.setBalance(this.getBalance()-withdraws);
			return null;
		}
		
	}
	@Override public void passTime(int term){
			
		 setBalance(getBalance()*(Math.pow(1+loan_interest, term)));
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
	}
	
	
	
