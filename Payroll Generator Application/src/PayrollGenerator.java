import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PayrollGenerator 
{	
	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		String uname = "c##"+sc.next();
		System.out.println("Enter Password");
		String pass = sc.next();
		if(uname.equals("c##Aditya") && pass.equals("aditya"))
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",uname,pass);
			System.out.println("Enter your Name");
			String name = sc.next();
			String sql = "select * from bank_details where name=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, name);
			ResultSet rs = st.executeQuery();
			int balance=0;		
			while(rs.next())
			{			
				balance=rs.getInt(3);			
			}
			System.out.println();		
			System.out.println("\tPay Slip Of "+ name+"!!");
			Slip s = new Slip(name);			
			s.calcHra(balance);
			s.calcDa(balance);
			s.calcTa(balance);
			s.calcGross(balance);
			s.calcNetSal(balance);
			s.generatePaySlip(balance);			
		}
		else
		{
			System.out.println("Invalid Login Credentials!");
		}
	}
}		