package Strings;

public class largestString {
    public static void main(String args[]){
        String fruit[]={"apple","mango","minimum", "banana"};
        String largest=fruit[0];
        for (int i = 0; i < fruit.length; i++) {
             if(largest.compareToIgnoreCase(fruit[i])<0){
                largest=fruit[i];
             }
        }
        System.out.println("Largest String: " +largest);
    }
}
