/*Modify the program in exercise 20 to include the following requirement. Assume that we
have to give weightage for sports before finalising the results. The weightage for sports is
stored in a separate class called Sports. Now write a Java program to have this.( Hint: Use
interface).*/
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
class sports extends Test
{
public int sportmarks;
public void sportmar(int m3)
{
sportmarks = m3;
}
public void showMarks()
{
System.out.println("Marks of Subjectl :: " + marksSubjectl);
System.out.println("Marks of Subject2 :: " + marksSubject2);
System.out.println("Marks of sports :: " + sportmarks);
}
}
class Result extends sports
{
private int totalMarks;
private float percentage;
private char grade;
public void evaluateResult()
{
totalMarks = marksSubjectl + marksSubject2+sportmarks ;
percentage = (totalMarks*100.00F/300.00F); if(percentage >=55.00F && percentage<=60.00F)
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
public class Q20
{
public static void main(String ar[])
{
Result ob = new Result();
ob.storeDetails(191039005, "Akshay Jeurkar");
ob.storeMarks(88,96);
ob.sportmar(88);
ob.evaluateResult();
ob.showResult();
}
}
