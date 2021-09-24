import java.util.Scanner;
class MensClothing extends ClothingStore
{
	void display()
	{
		System.out.println("Here you will get a variety of Men's Clothing! You Can Choose");
	}
	
}
class WomensClothing extends ClothingStore
{
	void display()
	{
		System.out.println("Here you will get a variety of Women's Clothing! You Can Choose");
	}
}
public class ClothingStore 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		MensClothing mc = new MensClothing();
		WomensClothing wc = new WomensClothing();
		System.out.println("Enter your Specific Choice! \nMen's Section\nWomen's Section");
		String str = sc.next();		
		if(str.equalsIgnoreCase("Mens"))
		{
			mc.display();
		}
		else if(str.equalsIgnoreCase("Womens"))
		{
			wc.display();
		}	
		else
		{
			System.out.println("Invalid Choice");
		}
	}
}
