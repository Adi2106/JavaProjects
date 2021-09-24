package BMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class Admin {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Admin Username");
		String uname = "c##"+sc.next();
		System.out.println("Enter Password");
		String pass=sc.next();
		if(uname.equalsIgnoreCase("c##Aditya") && pass.equalsIgnoreCase("aditya"))
		{
			System.out.println("$$$Welcome Admin$$$");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
			
			rs.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
			rs.setUsername(uname);
			rs.setPassword(pass);
			rs.setCommand("select * from banking_customer");
			rs.execute();
			System.out.println("What Operation Do you want to perform?\n1.Display\n2Insert\n3Update\n4Delete");
			String ch=sc.next();
			switch(ch)
			{
			case "1":
			case "display":
			case "Display":
				while(rs.next())
				{
					System.out.println("Customer Name: "+rs.getString(1)+"||"+" Account Number: "+rs.getLong(2)+"||"+" Adhaar Number: "+rs.getLong(3)+"||"+" Mobile Number: "+rs.getLong(4)+"||"+" Email: "+rs.getString(5));
					System.out.println("________________________________________________________________________________________________________________________________________________________________");
				}		
				break;
			case "2":
			case "insert":
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##Aditya","aditya");
				con.setAutoCommit(false);
				String si = "insert into banking_customer values(?,?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(si);
				System.out.println("Enter Name");
				String name=sc.next();
				System.out.println("Enter Account Number");
				long acNo=sc.nextLong();
				System.out.println("Enter Adhhar Number");
				long adNo=sc.nextLong();
				System.out.println("Enter Mobile Number");
				long mbNo=sc.nextLong();
				System.out.println("Enter Email");
				String email=sc.next();
				ps.setString(1, name);
				ps.setLong(2, acNo);
				ps.setLong(3, adNo);
				ps.setLong(4, mbNo);
				ps.setString(5, email);
				int n=ps.executeUpdate();
				con.commit();				
				System.out.println("Insertion Done Successfully!");
				rs=(JdbcRowSet) ps.executeQuery("select * from banking_customer");				
				while(rs.next())
				{
					System.out.println("Customer Name: "+rs.getString(1)+"||"+" Account Number: "+rs.getLong(2)+"||"+" Adhaar Number: "+rs.getLong(3)+"||"+" Mobile Number: "+rs.getLong(4)+"||"+" Email: "+rs.getString(5));
					System.out.println("````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````");
				}
				break;
			case "3":
			case "update":
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##Aditya","aditya");				
				conn.setAutoCommit(false);
				System.out.println("Enter the customer's name you want to update");
				String cusName = sc.next();
				System.out.println("Enter what you want to update\n1AccountNumber\n2AdhaarNumber\n3MobileNumber\n4Email");
				String up = sc.next();
				
				String s; 
				if(up.equalsIgnoreCase("1"))
				{
					System.out.println("Enter Updated Account Number");
					long accno=sc.nextLong();
					s = "update banking_customer set accno =? where name =?";
					PreparedStatement pss=conn.prepareStatement(s);
					pss.setString(1, cusName);
					pss.setLong(2, accno);
					pss = conn.prepareStatement(s);
					pss.executeQuery();	
					int n2=pss.executeUpdate();
					rs=(JdbcRowSet) pss.executeQuery();						
				}
				else if(up.equalsIgnoreCase("2"))
				{
					System.out.println("Enter Updated Adhaar Number");
					long adhno=sc.nextLong();
					s = "update banking_customer set adhaar_no =? where name =?";
					PreparedStatement pss=conn.prepareStatement(s);

					pss.setString(1, cusName);
					pss.setLong(2, adhno);
					pss = conn.prepareStatement(s);
					pss.executeQuery();
					int n2=pss.executeUpdate();
					rs=(JdbcRowSet) pss.executeQuery();						

				}
				else if(up.equalsIgnoreCase("3"))
				{
					System.out.println("Enter Updated Mobile Number");
					long mbno=sc.nextLong();
					s = "update banking_customer set mobile_no =? where name =?";
					PreparedStatement pss=conn.prepareStatement(s);

					pss.setString(1, cusName);
					pss.setLong(2, mbno);
					pss = conn.prepareStatement(s);
					pss.executeQuery();	
					int n2=pss.executeUpdate();
					rs=(JdbcRowSet) pss.executeQuery();						

				}
				else if(up.equalsIgnoreCase("4"))
				{
					System.out.println("Enter Updated Email Id ");
					String emaill = sc.next();
					s = "update banking_customer set email = ? where name =?";
					PreparedStatement pss=conn.prepareStatement(s);
					pss.setString(1, cusName);
					pss.setString(2, emaill);
					pss = conn.prepareStatement(s);
					pss.executeQuery();			
					int n2=pss.executeUpdate();
					rs=(JdbcRowSet) pss.executeQuery();						
				}
				else
				{
					System.out.println("Invalid Choice!!");
				}
				conn.commit();				
				System.out.println("Updation Done Successfully!");
				while(rs.next())
				{
					System.out.println("Customer Name: "+rs.getString(1)+"||"+" Account Number: "+rs.getLong(2)+"||"+" Adhaar Number: "+rs.getLong(3)+"||"+" Mobile Number: "+rs.getLong(4)+"||"+" Email: "+rs.getString(5));
					System.out.println("````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````");
				}
				break;
				
			case "4":
				System.out.println("Enter name you want to delete");
				String delname = sc.next();
				String del = "delete from banking_customer where name = ?";
				Connection delcon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##Aditya","aditya");
				delcon.setAutoCommit(false);
				PreparedStatement delps = delcon.prepareStatement(del);
				delps.setString(1, delname);
				delps.executeQuery();
				System.out.println("Deletion Done Successfully!");
				delcon.commit();				
				int n3=delps.executeUpdate();								
				break;				
			}			
		}
		else
		{
			System.out.println("Invalid Login Credentials!");
		}
		

	}

}
