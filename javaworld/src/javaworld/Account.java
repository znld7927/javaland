package javaworld;

public class Account{
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
		setMoney(balance+s);
	}
	
	public void debit(double s){
		setMoney(balance-s);
	}	
	
	
}