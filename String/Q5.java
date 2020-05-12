//Java Program to Remove the White Spaces
package String;
public class Q5 {
public static void main(String[] args) {
String sentence = "A ksh ay / 1910 39005.";
System.out.println("Original sentence: " + sentence);
sentence = sentence.replaceAll("\\s", "");
System.out.println("After replacement: " + sentence);
}
}