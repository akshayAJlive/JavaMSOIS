//Java Program to check if a Given String is getChar from Specific Index
package String;
class Q2 {
public static char
getCharFromString(String str, int index)
{
char[] singleCharArray = new char[1];
str.getChars(index, index + 1, singleCharArray, 0);
return singleCharArray[0];
}
public static void main(String[] args)
{
String str = "Akshay Jeurkar";
int index = 5;
char ch = getCharFromString(str, index);
System.out.println("Character from " + str
+ " at index " + index
+ " is " + ch);
}
}