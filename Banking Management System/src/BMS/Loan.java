package BMS;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Loan 
{
	LocalDate lD = LocalDate.now();
	LocalTime lt = LocalTime.now();
	String name;
	long accno,adhno;
	
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Loan(String name, long accno, long adhno) {
		super();
		this.name = name;
		this.accno = accno;
		this.adhno = adhno;
	}
	public String personalLoan(int amount)
	{
		return "Personal Loan Granted!";
	}
	public String homeLoan(int amount)
	{
		return "Home Loan Granted!";
	}
	public String eduLoan(int amount)
	{
		return "Education Loan Granted!";
	}

	public String carLoan(int amount)
	{
		return "Car Loan Granted!";
	}	
	public void display()
	{
		System.out.println("Loan Successfully Granted!");
		System.out.println();
		System.out.println("\tLoan Slip!");
		System.out.println("Recipient Name: "+name);
		System.out.println("Account Number: "+accno);
		System.out.println("Adhaar Card Number: "+adhno);
		System.out.println("Date Of Issue: "+lD);
		System.out.println("Time Of Issue: "+lt);
	}
	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
		Loan l = new Loan();
		System.out.println("What type of Loan you want?\n1Personal Loan\n2Home Loan\n3Education Loan\n4Car Loan");
		String ls=sc.next();
		
		System.out.println("Enter the Amount");
		int amt = sc.nextInt();
		if(ls.equals("1"))
		{
			l.personalLoan(amt);
		}
		else if(ls.equals("2"))
		{
			l.homeLoan(amt);
		}
		else if(ls.equals("3"))
		{
			l.eduLoan(amt);
		}
		else if(ls.equals("4"))
		{
			l.carLoan(amt);
		}
		else			
		{
			System.out.println("Invalid Input");
		}
	}

}
