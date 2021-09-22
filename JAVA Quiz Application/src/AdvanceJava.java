import java.util.Scanner;
public class AdvanceJava
{
	public int test(Questions q[])
	{
		int score=0;
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
		AdvanceJava cj=new AdvanceJava();
		String q1="Which interface is used to stablish relation between the database and the JAVA Program?"
				+ "\na)Statement \tb)Connect \t\tc)Connection \td)Connections";
		String q2="Which among the following in JDBC is the best driver?"
				+ "\na)JDBC-ODBC \tb)Native Api \tc)Thin \td)Network-Protocol  Driver";
		String q3="Select the packages in which JDBC classes are defined?"
				+ "\na)jdbc and javax.jdbc \tb)rdb and javax.rdb \tc)jdbc and java.jdbc.sql \td)sql and javax.sql";
		String q4="Thin driver is also known as?"
				+ "\na)Type 3 Driver \tb)Type 2 Driver  \tc)Type 1 Driver \td)Type 4 Driver";
		String q5="Which of the following method is used to perform DML statements in JDBC?"
				+ "\na)executeResult() \tb)executeQuery() \tc)executeUpdate() \td)execute()";
		
		Questions q[] = {
				new Questions(q1,"c"),
				new Questions(q2,"c"),
				new Questions(q3,"d"),
				new Questions(q4,"d"),
				new Questions(q5,"c")
		};
		int score = cj.test(q);
		cj.display(score, q);
		
	}

}
