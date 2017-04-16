package javaworld;
import java.util.Scanner;

public class exceptiontest {
	public static int quotient(int num, int dem){
		return num/dem;
	}
	public static void main(String args[]){
	try{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the number");
		int num = scanner.nextInt();
		
		System.out.println("enter the number");
		int dem = scanner.nextInt();
		
		int result = quotient(num,dem);
		System.out.printf("%d/%d=%d", num,dem,result);
		}
	catch(ArithmeticException ex){
		System.out.print("ddddddddd");		
	}
	}

}
