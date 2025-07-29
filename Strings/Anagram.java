package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String args[]) {
        String str1 = "anyways";
        String str2 = "anyway";

        // to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            // make array to store all character
            char[] str1Array = str1.toCharArray();
            char[] str2Array = str2.toCharArray();

            // sort array so that we can later compare the elements
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            boolean flag = Arrays.equals(str1Array, str2Array);
            if (flag) {
                System.out.println(" Two string are Anagrams");
            } else {
                System.out.println("Strings are not Anagrams");
            }
        }

        else {
            System.out.println("Strings are not Anagrams");

        }

    }
}
