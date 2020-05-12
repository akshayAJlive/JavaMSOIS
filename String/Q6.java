//Java Program to Split a Regular Expression
package String;
public class Q6{
public static void main(String args[]){
String s1="Manipal School of Information Sciences Manipal";
String[] words=s1.split("\\s");
for(String w:words){
System.out.println(w);
}
}}