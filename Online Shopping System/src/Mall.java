import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Mall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Customer cus = new Customer();
		System.out.println("Welcome to My Shopping Mall " + cus.name);
		System.out.println("What are you here for? \n1.Cloting\n2.Grossery\n3.Electronics");
		String str = sc.next();
		cus.display();
		if(str.equalsIgnoreCase("clothes") || str.equalsIgnoreCase("1"))
		{
			
			System.out.println("Enter your Specific Choice! \nMen's Section\nWomen's Section");
			String sstr = sc.next();		
			MensClothing mc = new MensClothing();
			WomensClothing wc = new WomensClothing();
			if(sstr.equalsIgnoreCase("Mens"))
			{
				mc.display();
			}
			else if(sstr.equalsIgnoreCase("Womens"))
			{
				wc.display();
			}	
			else
			{
				System.out.println("Invalid Choice");
			}
		}
	
		else if(str.equalsIgnoreCase("grossery") || str.equalsIgnoreCase("2"))
		{
			System.out.println("Welcome to the Grossery Store!!");
			ArrayList<Grossery> al = new ArrayList<>();
			Grossery g = new Grossery("Potatoes","30perKg");		
			al.add(g);
			Grossery g1 = new Grossery("Tomatoes","20perKg");		
			al.add(g1);
			Grossery g2 = new Grossery("Onions","25perKg");		
			al.add(g2);
			Grossery g3 = new Grossery("Bringle","15perKg");		
			al.add(g3);
			Grossery g4 = new Grossery("Lemons","10perKg");		
			al.add(g4);
			Grossery g5 = new Grossery("Cabbage","15perPeice");		
			al.add(g5);
			Iterator<Grossery> t = al.iterator();
			while(t.hasNext())
			{
				System.out.println(t.next());
			}
		}
		else
		{			
			System.out.println("Enter your Specific choice! \n1.Mobiles\n2.Laptops\n3.Cameras");
			String ssstr = sc.next();					
			
			if(ssstr.equalsIgnoreCase("Mobiles") || (ssstr.equalsIgnoreCase("1")))
			{
				System.out.println("Welcome to Mobile Store!");
				ArrayList<MobilePhones> al = new ArrayList<>();
				MobilePhones mb = new MobilePhones("Samsung","M51","6000mAh",30000);
				al.add(mb);
				MobilePhones mb1 = new MobilePhones("Samsung","M31","5000mAh",20999);
				al.add(mb1);
				MobilePhones mb2 = new MobilePhones("Samsung","M21","6000mAh",15999);
				al.add(mb2);
				MobilePhones mb3 = new MobilePhones("Samsung","M11","5500mAh",12999);
				al.add(mb3);
				MobilePhones mb4 = new MobilePhones("Samsung","M30s","6000mAh",25999);
				al.add(mb4);
				
				Object o[] = al.toArray();
				for(Object ob : o)
				{			
					System.out.println(ob);
				}
				System.out.println("Which one you want to purchase? Enter Model name.");
				String s = sc.next();				
				if(s.equalsIgnoreCase("M51"))
				{		
					cus.details();
					cus.bal(30000);
				}
				else if(s.equalsIgnoreCase("M31"))
				{	
					cus.details();
					cus.bal(20999);
				}
				else if(s.equalsIgnoreCase("M21"))
				{			
					cus.details();
					cus.bal(15999);
				}
				else if(s.equalsIgnoreCase("M11"))
				{	
					cus.details();
					cus.bal(12999);
				}
				else if(s.equalsIgnoreCase("M30S"))
				{					
					cus.details();
					cus.bal(25999);
				}
				else
					System.out.println("Choose Correctly");
			}
			else if(ssstr.equalsIgnoreCase("Laptops") || (ssstr.equalsIgnoreCase("2")))
			{
				ArrayList<Laptops> al = new ArrayList<>();
				Laptops l = new Laptops("HP","i7",100000);
				al.add(l);
				Laptops l1 = new Laptops("Sony","i5",40500);
				al.add(l1);
				Laptops l2 = new Laptops("Dell","i7",75000);
				al.add(l2);
				Laptops l3 = new Laptops("Lenovo","i7",85000);
				al.add(l3);
				Laptops l4 = new Laptops("Acer","i5",35000);
				al.add(l4);
				
				
				Object o[] = al.toArray();
				for(Object ob : o)
				{			
					System.out.println(ob);
				}
				
				System.out.println("Which one you want to purchase?");
				String s = sc.next();
				if(s.equalsIgnoreCase("HP"))
				{			
					cus.details();
					cus.bal(100000);
				}
				
				else if(s.equalsIgnoreCase("Dell"))
				{			
					cus.details();
					cus.bal(40500);
				}
				else if(s.equalsIgnoreCase("Lenove"))
				{			
					cus.details();
					cus.bal(85000);
				}
				else if(s.equalsIgnoreCase("Acer"))
				{		
					cus.details();
					cus.bal(35000);
				}
				else if(s.equalsIgnoreCase("Sony"))
				{		
					cus.details();
					cus.bal(40500);
				}
				
				else
					System.out.println("Choose Correctly");
			}
			else if(ssstr.equalsIgnoreCase("Cameras") || (ssstr.equalsIgnoreCase("3")))
			{
				ArrayList<Camera> al = new ArrayList<>();
				Camera c = new Camera("Sony1","DSLR Single Lens",35000);
				al.add(c);
				Camera c1 = new Camera("Sony2","DSLR Double Lens",55000);
				al.add(c1);
				Camera c2 = new Camera("Nikon1","Single Lens",25000);
				al.add(c2);
				Camera c3 = new Camera("Nikon2","Double Lens",35000);
				al.add(c3);
				Camera c4 = new Camera("Kodak","Basic",5000);
				al.add(c4);
				
				Object o[] = al.toArray();
				for(Object ob : o)
				{			
					System.out.println(ob);
				}
				System.out.println("Which one you want to purchase?");
				String s = sc.next();
				if(s.equalsIgnoreCase("Kodak"))
				{	
					cus.details();
					cus.bal(5000);
				}
				
				else if(s.equalsIgnoreCase("Nikon1"))
				{		
					cus.details();
					cus.bal(2500);
				}
				else if(s.equalsIgnoreCase("Nikon2"))
				{		
					cus.details();
					cus.bal(2500);
				}
				
				else if(s.equalsIgnoreCase("Sony1"))
				{		
					cus.details();
					cus.bal(2500);
				}
				else if(s.equalsIgnoreCase("Sony2"))
				{		
					cus.details();
					cus.bal(2500);
				}
				else
					System.out.println("Not Available!");
			}
			else
			{
				System.out.println("Invalid Choice");
			}
		}		
	
	}
}
