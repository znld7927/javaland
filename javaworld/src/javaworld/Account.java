package javaworld;

abstract class Account{
	protected double balance;

	
	public Account(double s){
		balance = s;
	}
	
	protected void setMoney(double s){
		balance = s;
	}
	
	public double getMoney(){
		return balance;
	}
	
	public void credit(double s){
		balance +=s;
	}
	
	public void debit(double s){
		balance -=s;
	}
	
	public abstract double getWithdrawableAccount();
	public abstract void passtime(int month);
}