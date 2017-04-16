package javaworld;

public class Car implements Valuable{
	protected String name;
	protected double price;
	
	public Car(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	public String toString(){
		return String.format("Car name:%s\n initial price:%.2f\n", name, price);
	}
	
	@Override
	public double EstimateValue(int month){
		return price*0.8*Math.pow(0.99, month);
	}
	
}
