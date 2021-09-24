import java.util.ArrayList;
import java.util.Scanner;
class MobilePhones extends ElectronicDevices
{
	String name, model, battery;
	int price;
	MobilePhones(String name, String model, String battery,	int price)
	{
		this.name = name;
		this.model = model;
		this.battery = battery;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "MobilePhones [name=" + name + ", model=" + model + ", battery=" + battery + ", price=" + price + "]";
	}
	
}
/*class Iphone extends MobilePhones
{
	
}
class Samsung extends MobilePhones
{
	
}
class Redmi extends MobilePhones
{
	
}*/
class Laptops extends ElectronicDevices
{
	String name, model;
	int price;
	Laptops(String name, String model,int price)
	{
		this.name = name;
		this.model = model;		
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptops [name=" + name + ", model=" + model + ", price=" + price + "]";
	}	
	
}
class Camera extends ElectronicDevices
{
	String name, model;
	int price;
	Camera(String name, String model,int price)
	{
		this.name = name;
		this.model = model;		
		this.price = price;
	}
	@Override
	public String toString() {
		return "Camera [name=" + name + ", model=" + model + ", price=" + price + "]";
	}
	
}
public class ElectronicDevices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter your Specefic choice! \nMobiles\nLaptops\nCameras");
		String str = sc.next();
		if(str.equalsIgnoreCase("Mobiles"))
		{
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
		}
		else if(str.equalsIgnoreCase("Laptops"))
		{
			ArrayList<Laptops> al = new ArrayList<>();
			Laptops l = new Laptops("HP","i7",115000);
			al.add(l);
			Laptops l1 = new Laptops("HP","i5",40500);
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
		}
		else if(str.equalsIgnoreCase("Cameras"))
		{
			ArrayList<Camera> al = new ArrayList<>();
			Camera c = new Camera("Sony","DSLR Single Lens",35000);
			al.add(c);
			Camera c1 = new Camera("Sony","DSLR Double Lens",55000);
			al.add(c1);
			Camera c2 = new Camera("Nikon","Single Lens",25000);
			al.add(c2);
			Camera c3 = new Camera("Nikon","Double Lens",35000);
			al.add(c3);
			Camera c4 = new Camera("Kodak","Basic",5000);
			al.add(c4);
			
			Object o[] = al.toArray();
			for(Object ob : o)
			{			
				System.out.println(ob);
			}
		}
		else
		{
			System.out.println("Invalid Choice");
		}
	}

}
