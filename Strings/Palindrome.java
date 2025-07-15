package Strings;

public class Palindrome {
    public static void main(String[] args) {
         String s="rumi"; 
         String  rev =new String("");
         int len=s.length();
         for (int i = len-1; i >=0; i--) {
            rev= rev+s.charAt(i);
         }

         if(rev.equalsIgnoreCase(s))
         {System.out.println("Palindrome");}else{System.out.println("NOT PALINDROME");}
    }
}
