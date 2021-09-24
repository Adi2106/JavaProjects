import java.util.Scanner;

public class Customer
{
	String name;
	int money;
	long n;
	int pn;
	Customer()
	{
		this.name ="Aditya";
		this.money = 100000;
	}	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", money=" + money + "]";
	}
	void details()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mobile no:");
		n = sc.nextLong();
		System.out.println("Enter your Pincode:");
		pn = sc.nextInt();
	}
	void bal(int price)
	{
		int bal = money - price;
		System.out.println("Congratulations! You have Successfully Purchased your order.");
		System.out.println("Your order will be delivered at Pincode  " + pn );
		System.out.println("You have " + bal + " balance left with you");
		
	}
	void display()
	{ 
		System.out.println("You have " + money + " for shopping");
	}
}
