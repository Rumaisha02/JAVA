package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String s = "0P";
        boolean ans = isPalindrome(s);
        if (ans == true) {
            System.out.println("string is PALINDROME");
        } else {
            System.out.println("String is not PALINDROME");
        }
        // String rev =new String("");
        // int len=s.length();
        // for (int i = len-1; i >=0; i--) {
        // rev= rev+s.charAt(i);
        // }

        // if(rev.equalsIgnoreCase(s))
        // {System.out.println("Palindrome");}else{System.out.println("NOT
        // PALINDROME");}

        // //another way
        // for (int index = 0; index < len/2; index++) {
        // if (s.charAt(index)!=s.charAt(len-1-index)) {
        // System.out.println(" String not palindrome ");break;
        // }
        // }
    }

    public static boolean isPalindrome(String s) {
       String str = s.toLowerCase();
        String str1 = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str1);
        if(str1.length()<=1){
            return true;
        }
        boolean flag=false;
        int i = 0, j = str1.length()-1;
        while (i < j) {
           
            if (str1.charAt(i) != str1.charAt(j)) {
                return false;
            } if(str1.charAt(i)==str1.charAt(j)) {
                flag = true;
            }
            i++;
            j--;
        }
        return flag;
    

    }
}
