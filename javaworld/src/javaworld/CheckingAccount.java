package javaworld;

public class CheckingAccount extends Account {
	
	private double credit_limit, interest, loan_interest;
	//protected double balance;
	
	public CheckingAccount(double s){
		super(s);
		setMoney(s);
		credit_limit = 1000.0;
		interest = 1.03;
		loan_interest = 1.30;
	}
	
	@Override
	public void debit(double s){
		if(s > balance + credit_limit){
			System.out.print("√‚±›∫Ê∞°");
		} else {
			balance -= s;
				}
		}	
	
	public void nextMonth(){
		if(0<=balance){
			setMoney(getMoney()*interest);	
		}else{
			setMoney(getMoney()*loan_interest);
		}
	}
	
}
