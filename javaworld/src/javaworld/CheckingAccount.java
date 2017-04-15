package javaworld;

public class CheckingAccount extends Account {
	
	private double credit_limit, interest, loan_interest;
	//protected double balance;
	
	public CheckingAccount(double s, double credit_limit, double interest, double loan_interest){
		super(s);
		setMoney(s);
		credit_limit = 0;
		interest =0;
		loan_interest =0;
	}
	
	@Override
	public void debit(double s){
		if(s > balance + credit_limit){
			System.out.print("√‚±›∫Ê∞°");
		} else {
			balance -= s;
		  }
	}	
	
	@Override
	public double getWithdrawableAccount(){
		if(balance+credit_limit<=0){
			return 0;
		}else{
			return balance+credit_limit;
		}
	}
	
	@Override
	public void passtime(int month){
		if(balance<0){
			balance+=balance*loan_interest*month;
		}else{
			balance +=balance*interest*month;
		}
	}
	
	public boolean isBankrupted(){
		if(balance<-credit_limit){
			return true;
		}else{
			return false;
		}
	}
	/*
	public void nextMonth(){
		if(0<=balance){
			setMoney(getMoney()*interest);	
		}else{
			setMoney(getMoney()*loan_interest);
		}
	}*/
	
}
