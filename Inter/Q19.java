/*Assume that the test results of a batch of students are stored in three different classes.
Class Student stores the rollNumber, class Test stores the marks obtained in two different
subjects and class Result contains the total marks obtained in the test. The class Result can
inherit the details of the marks obtained in the test and the rollNumber of students through
multilevel inheritance. Write a Java Program to implement this.*/
package Inter;
class Student

{
	private int rollno;

	private String name;
	public void storeDetails(int rno, String sname)
	{

		rollno = rno;

		name = sname;
		}

		public void showDetails()

		{

		System.out.println("ROll No :: " + rollno);

		System.out.println("Name :: " + name);
		}

		}

		class Test extends Student

		{

		protected int marksSubjectl;

		protected int marksSubject2;

		public void storeMarks(int ml, int m2)

		{

		marksSubjectl = ml;

		marksSubject2 = m2;
		}

		public void showMarks()

		{

		System.out.println("Marks of Subjectl :: " + marksSubjectl);

		System.out.println("Marks of Subject2 :: " + marksSubject2);
		}

		}

		 

		class Result extends Test

		{

		private int totalMarks;

		private float percentage;

		private char grade;

		public void evaluateResult()

		{

		totalMarks = marksSubjectl + marksSubject2 ;

		percentage = (totalMarks*100.00F/200.00F);
        if(percentage >=55.00F && percentage<=60.00F)

		grade = 'C';

		else if (percentage >=61.00F && percentage<=70.00F)

		grade = 'B';

		else if (percentage >=85.00F && percentage<=100.00F)

		grade = 'A';

		else if (percentage >=76.00F && percentage<=85.00F)

		grade = 'H';

		else

		grade = 'S';

		}

		public void showResult()

		{

		showDetails();

		showMarks();

		System.out.println("Total Marks :: " + totalMarks);

		System.out.println("percentage :: " + percentage);

		System.out.println("Grade :: " + grade);

		}

		}

		public class Q19

		{

		public static void main(String ar[])

		{

		Result ob = new Result();

		ob.storeDetails(191039005, "Akshay Jeurkar");

		ob.storeMarks(88,96);

		ob.evaluateResult();

		ob.showResult();

		}

		}
