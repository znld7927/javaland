package javaworld;
import java.util.Scanner;

public class AccountTest {
 
 public static void main(String[] args){
  Account account1 = new CheckingAccount(100, 50, 0.07, 0.07);
  Account account2 = new SavingAccount(100, 0.05);
  
  //CheckingAccount
  Scanner scan = new Scanner(System.in);
  double amount;
  
  System.out.printf("Account1 balance: $ %.2f \t현재출금가능액: %.2f\n", account1.getMoney(), account1.getWithdrawableAccount());
  System.out.println("enter withdrawal amount for Account1:");
  amount = scan.nextDouble();
  account1.debit(amount);
  
  System.out.printf("Account1 balance: $%.2f \t현재출금가능액: %.2f \n",account1.getMoney(),account1.getWithdrawableAccount());
  //파산여부를 확인하는 코드(a)
  if(((CheckingAccount)account1).isBankrupted()){
	  System.out.println("account1 went bankrupt");
  }
  
  account1.passtime(1);
  System.out.printf("Account1 balance: $%.2f \t현재출금가능액: %.2f \n", account1.getMoney(),account1.getWithdrawableAccount());
  if(((CheckingAccount)account1).isBankrupted()){
	  System.out.println("account1 went bankrupt");
  }
  
  account1.passtime(5);
  System.out.printf("Account1 balance: $%.2f \t현재출금가능액: %.2f \n", account1.getMoney(),account1.getWithdrawableAccount());
  if(((CheckingAccount)account1).isBankrupted()){
	  System.out.println("account1 went bankrupt");
  }
  
  //SavintAccount
  System.out.println();
  System.out.printf("Account2 balance: $%.2f \t현재출금가능액:%.2f\n", account2.getMoney(), account2.getWithdrawableAccount());
  
  System.out.println("6 month later!");
  account2.passtime(6);
  System.out.printf("Account2 balance: $%.2f \t현재출금가능액:%.2f\n", account2.getMoney(), account2.getWithdrawableAccount());  
  account2.debit(50);
  
  System.out.println("next 6 month later!");
  account2.passtime(6);
  System.out.printf("Account2 balance: $%.2f \t현재출금가능액:%.2f\n", account2.getMoney(), account2.getWithdrawableAccount());  
  
  System.out.println("next 1 month later!");
  account2.passtime(1);
  System.out.printf("Account2 balance: $%.2f \t현재출금가능액:%.2f\n", account2.getMoney(), account2.getWithdrawableAccount()); 
  account2.debit(50);
  System.out.printf("Account2 balance: $%.2f \t현재출금가능액:%.2f\n", account2.getMoney(), account2.getWithdrawableAccount()); 
  
  /*
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
*/
  
 }

}