package javaworld;

public class Human implements Valuable {
	protected String name;
	protected int age;
	
	public Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return String.format("Human name:%s\nregistered age:%d\n", name, age);
	}
	
	@Override
	public double EstimateValue(int month){
		return Double.POSITIVE_INFINITY;
	}
	
	

}
