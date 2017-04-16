package javaworld;

public class SavingAccount extends Account{
	private double interest;
	private int month;
	
	public SavingAccount(double balance, double interest){
		super(balance);
		interest = interest;
		month = 0;
	}
	
	@Override
	public void debit(double s){
		if(month<=12){
			System.out.println("아직출금할수없긔");
		}else{
			balance -= s;
		}
	}
	
	@Override
	public double getWithdrawableAccount(){
		if(month<=12){
			return 0;
		}else{
			return balance;
		}
	}
	
	@Override
	public void passtime(int month){
		this.month +=month;
		if(this.month>12){
			balance=balance*Math.pow(1+interest, 12);
		}
	}
	
	public String toString(){
		return String.format("SavingAccount balance:%.2f", this.getMoney());
	}
	

	public double EstimateValue(int month) {
		return balance * Math.pow((1+interest), month);
	}
	
	
	
}
