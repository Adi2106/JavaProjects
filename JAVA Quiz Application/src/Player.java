import java.util.Scanner;

public class Player {

	public static void main(String[] args)
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = sc.nextLine();
		System.out.println("Which Quiz you want to play?"
				+ "\n1)Core Java\n2)Advance Java");
		String ch = sc.next();
		if(ch.equals("1"))
		{
			System.out.println("Welcome to Core JAVA Quiz!");
			System.out.println();
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
		else if(ch.equals("2"))
		{
			System.out.println("Welcome to Advance JAVA Quiz!");
			System.out.println();
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
		else
		{
			System.out.println("Invalid Input!");
		}
			 
	}

}
