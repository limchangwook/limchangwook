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
	
	@Override public String debit(double withdraws){
		if(credit_limit<withdraws){
			return "too much";
		}
		else{
			setBalance(getBalance()-withdraws);
			return null;
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
	
	
	
