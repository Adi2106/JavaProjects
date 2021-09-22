package BMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class Customer 
{
	String name,email;
	long mobNo,adhaarNo,AccNo;	
	public Customer(String name, long accNo, long adhaarNo, long mobNo, String email )
	{
		super();
		this.name = name;
		this.AccNo = accNo;
		this.adhaarNo = adhaarNo;
		this.mobNo = mobNo;
		this.email = email;
	}
	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		Scanner sc = new Scanner(System.in);				
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Enter Customer Username");
		String uname = "c##"+sc.next();
		System.out.println("Enter Password");
		String pass=sc.next();
		if(uname.equalsIgnoreCase("c##Aditya") && pass.equalsIgnoreCase("aditya"))
		{
			System.out.println("Access Granted!");
			System.out.println();
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", uname,pass);
			System.out.println("Enter your name");
			String name = sc.next();		
			PreparedStatement ps = con.prepareStatement("select * from banking_customer where name=?");		
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			long acn=0,adno=0;		
			System.out.println();
			System.out.println("$$$Customer Details$$$");
			while(rs.next())
			{
				System.out.println("________________________________");			
				System.out.println("Customer Name:\t" + rs.getString(1));
				acn=rs.getLong(2);
				System.out.println("Account Number:\t" + acn );
				adno=rs.getLong(3);
				System.out.println("Adhaar Number:\t" + adno);
				System.out.println("Mobile Number:\t" + rs.getLong(4));
				System.out.println("Customer Email:\t" + rs.getString(5));			
				System.out.println("________________________________");
			}	
			System.out.println();
			System.out.println();
			System.out.println("$$$Bank Details$$$");
			PreparedStatement bps = con.prepareStatement("select * from bank_details where accno=?");
			bps.setLong(1, acn);
			ResultSet rss = bps.executeQuery();
			int balance=0;
			while(rss.next())
			{
				System.out.println("________________________________");						
				System.out.println("Account Number:\t" + rss.getLong(1));
				System.out.println("IFSC:\t" + rss.getString(2));				
				balance=rss.getInt(3);
				System.out.println("Bank Balance:\t" + balance);
				System.out.println("Account Holder Name:\t" + rss.getString(4));			
				System.out.println("_________________________________");
			}
			
			BankBalance b= new BankBalance();
			System.out.println();
			System.out.println();
			System.out.println("What do you want to do? \n1.Deposit\n2.Withdraw\n3.Loan Window ");
			String ch=sc.next();
			if(ch.equalsIgnoreCase("1"))
			{
				System.out.println("Enter the amount to be deposited.");
				int amt=sc.nextInt();						
				balance=b.deposit(balance,amt);
				System.out.println("Amount Deposited Successfully \nUpdated Balance: "+balance);
				System.out.println("Thank You!");
			}
			else if(ch.equalsIgnoreCase("2"))
			{
				System.out.println("Enter the amount to be Withdrawn.");
				int amt=sc.nextInt();						
				balance=b.withdraw(balance,amt);
				System.out.println("Amount Withdrawn Successfully \nUpdated Balance: "+balance);
				System.out.println("Thank You!");
			}
			else if(ch.equalsIgnoreCase("3"))
			{
				Loan l = new Loan(name,acn,adno);
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
				l.display();
			}
			else
			{
				System.out.println("Invalid Login Credentials!");
			}
		}
	}
}
		


