package BMS;

import java.util.Scanner;

public class BankBalance 
{
	
	public int withdraw(int balance,int bal)
	{
		return balance-bal;
	}
	public int deposit(int balance,int bal)
	{
		return balance+bal;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		BankBalance b= new BankBalance();	
		System.out.println("Enter Current Balance");
		int balance = sc.nextInt();
		System.out.println("What do you want to do? \n1.Deposit\n2.Withdraw ");
		String ch=sc.next();
		if(ch.equalsIgnoreCase("1"))
		{
			System.out.println("Enter the amount to be deposited.");
			int amt=sc.nextInt();						
			balance=b.deposit(balance,amt);
			System.out.println("Amount Deposited Successfully \nUpdate Balance: "+balance);
		}
		else if(ch.equalsIgnoreCase("2"))
		{
			System.out.println("Enter the amount to be Withdrawn.");
			int amt=sc.nextInt();						
			balance=b.withdraw(balance,amt);
			System.out.println("Amount Withdrawn Successfully \nUpdate Balance: "+balance);
		}
	}
}
