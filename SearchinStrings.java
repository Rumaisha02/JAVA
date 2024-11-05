//PRogram is to search for any character inside the string just the way we do in arrays using linear search and other things.
import java.util.*;
public class SearchinStrings {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    String str="Rumaisha";
    System.out.println("Enter the character to search for");
    char c=sc.next().charAt(0);
    boolean ans=Search1(str, c);
    boolean ans2=Search2(str, c);
    if(ans2==false){
        System.out.println("Character not found --Search2");
    }
    else{
        System.out.println("Character found--Search2");
    }
    if(ans==false){
        System.out.println("Character not found");
    }
    else{
        System.out.println("Character found");
    }
    sc.close();
    }

    static boolean Search2(String str,char target){
        if(str.length()==0){
            return false;
        }
        for (char c : str.toCharArray())//this .toCharArray() function changes the string to an array to make
             {                        //it easy to iterate through coz foreach works for array like data                           
            if(target==c){
                return true;
            }
        }
        return false;
    }
    static boolean Search1(String str,char target){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target==str.charAt(i)){
                return true;
            }  
        }
        return false;
    }
}
