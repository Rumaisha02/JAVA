package Strings;

public class LowercaseVowels {
    public static void main(String[] args) {
     String str="hello";int count=0;
     for(int i=0;i<str.length();i++){
         char ch=str.charAt(i);
         if(Character.isLowerCase(ch)){
             if(ch=='a'|| ch=='e' || ch=='u'  ||ch=='i' || ch=='o')
             {
             count++;
                 
             }
         }
     }
     System.out.println("lowercase characters are: "+count);
    }
}