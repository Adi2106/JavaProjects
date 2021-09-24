
public class Slip
{
	String name;
	double  it;    
    double ta, da, hra, grossSal, netSal;
	public Slip(){}	
	public Slip(String name)
	{
		this.name=name;
	}	
	void calcHra(double sal)
    {
        hra = 0.1 * sal;        
    }
	void calcDa(double sal)
    {
        da = 0.05 * sal;       
    }
	void calcTa(double sal)
    {
         ta = 0.02 * sal;        
    }
    
    void calcGross(double sal)
    {
         grossSal = sal + ta + da + hra;       
    }
    void calcNetSal(double sal)
    {
        netSal = grossSal - ((1800)*12+it);        
    }
    void generatePaySlip(double sal)
    {         
         System.out.println();
         System.out.println("Employee Name : " + name);   
         System.out.println("Basic Pay : " + sal);
         System.out.println("Providend Fund : " + 1800*12);         
         System.out.println("Dearness Allowance : " + da);
         System.out.println("House Rent Allowance : " + hra);
         System.out.println("Travelling Allowance : " + ta);
         System.out.println("Gross Pay : " + grossSal);
         System.out.println("Final Net Payment : " + netSal);        
    }
	public static void main(String[] args) 
	{		
		Slip s = new Slip();
	}

}
