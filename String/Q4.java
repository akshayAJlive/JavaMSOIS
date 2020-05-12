//Java Program to Find All Possible Subsets of given Length in String
package String;
public class Q4 {
public static void main(String[] args) {
String str = "AKSHAY";
int len = str.length();
int temp = 0;
String arr[] = new String[len*(len+1)/2];
for(int i = 0; i < len; i++) {
for(int j = i; j < len; j++) {
arr[temp] = str.substring(i, j+1);
temp++;
}
}
System.out.println("All subsets for given string are: ");
for(int i = 0; i < arr.length; i++) {
System.out.println(arr[i]);
}
}
}