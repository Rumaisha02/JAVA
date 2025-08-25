package Strings;
 import java.util.*;
public class countDigitStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        String s=Long.toString(n);//converting any number to String
        System.out.println("No of digits in the given number is: "+ s.length());
        String str="88765";
        int f=Integer.parseInt(str);//converting any string to interger
        System.out.println(f);
       
        //string to char array
        String s1="Rumaisha";
        char ch[]=s1.toCharArray();
        System.out.println(Arrays.toString(ch));
        sc.close();
    }
}
