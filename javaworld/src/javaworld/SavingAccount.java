package javaworld;

public class SavingAccount extends Account{
	private double interest;
	private int month;
	
	public SavingAccount(double s, double in){
		super(s);
		setMoney(s);
		interest = in;
		month = 0;
	}
	
	@Override
	public void debit(double s){
		if(month<=12){
			System.out.println("��������Ҽ�����");
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
	
	
	
	
}
