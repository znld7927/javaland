package javaworld;
import java.util.Scanner;

public class AccountTest {
 
 public static void main(String[] args){
  CheckingAccount account1 = new CheckingAccount(100);
  CheckingAccount account2 = new CheckingAccount(100);
  
  System.out.printf("account1 balance : $%.2f\n", account1.getMoney());
  System.out.printf("account2 balance : $%.2f\n", account2.getMoney());
  
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Enter withdrawal1 amount for account1: ");
  double withdraw1 = sc.nextDouble();
  
  account1.credit(withdraw1);  
  
  System.out.printf("account1 balance : $%.2f\n", account1.getMoney());
  System.out.printf("account2 balance : $%.2f\n", account2.getMoney());
  
  //account2 출금
  System.out.printf("Enter withdrawal2 amount for account2: ");
  double withdraw2 = sc.nextDouble();
  
  account2.debit(withdraw2);
  
  System.out.printf("account1 balance : $%.2f\n", account1.getMoney());
  System.out.printf("account2 balance : $%.2f\n", account2.getMoney());
 
  
  System.out.println("Next Month!");
  
  //이자율계산하는코드  
  account1.nextMonth();
  account2.nextMonth();
  
  System.out.printf("account1 balance : $%.2f\n", account1.getMoney());
  System.out.printf("account2 balance : $%.2f\n", account2.getMoney());
  
 }

}