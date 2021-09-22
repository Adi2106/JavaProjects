import java.util.Scanner;
public class CoreJava
{
	int score=0;
	public int test(Questions q[])
	{		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<q.length;i++)
		{			
			System.out.println(q[i].prompt);
			String input = sc.next();
			if(input.equals(q[i].answer))
			{
				score++;
			}
		}
		return score;
	}
	public void display(int score,Questions[] q)
	{
		System.out.println("You have completed the test.");
		System.out.println("Total Number of Questions: " + q.length);
		int n = q.length;
		System.out.println("Number Of Questions Answered Correctly:  " + score );	
		System.out.println("You Scored: " + (score*100)/n +"%");
	}
	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
		CoreJava cj=new CoreJava();
		String q1="Which keyword is used in order to execute the JAVA Program?"
				+ "\na)javac \tb)java \t\tc)javax \td)None Of These";
		String q2="Which among the following in JAVA is a Mutable Class But not Thread Safe?"
				+ "\na)String\tb)String Buffer \tc)String Builder\td)None Of These";
		String q3="Which keyword is used to achieve Abstraction JAVA ?"
				+ "\na)abstract \tb)interface \tc)both a and b \td)final";
		String q4="Where are Objects stored in Java?"
				+ "\na)Heap Memory\tb)Stack  \tc)Native Memory \td)None Of These";
		String q5="Which of the following is not a functionality in JAVA?"
				+ "\na)function overloading \tb)function overriding \tc)virtual functions \td)constructor chaining";
		
		Questions q[] = {
				new Questions(q1,"b"),
				new Questions(q2,"c"),
				new Questions(q3,"c"),
				new Questions(q4,"a"),
				new Questions(q5,"c")
		};
		int score = cj.test(q);
		cj.display(score, q);
		
	}

}
