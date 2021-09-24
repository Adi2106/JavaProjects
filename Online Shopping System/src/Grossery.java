import java.util.*;
public class Grossery extends Mall {
	String name, price;
	Grossery(String name, String price)
	{
		this.name= name;
		this.price = price;
	}	
	@Override
	public String toString() {
		return "Grossery [name=" + name + ", price=" + price + "]";
	}		
}
