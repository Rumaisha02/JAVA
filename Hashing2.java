/*Stores key:values in java coding..Key is always unique
 * It's imported using package "HashMap"
 */
import java.util.*;
public class Hashing2{
    public static void main(String[]args){
     //country(key) population(value)
     HashMap <String, Integer> map= new HashMap<>();
     //Insertion using .put()
     map.put("India",130);
     map.put("USA",90);
     map.put("Turkey",100);
     System.out.println(map);
     map.put("Turkey",110);//updates if key already exist and creates new pair if it's completely new
     System.out.println(map);

     //Search or check using .containsKey("keyName") ..return boolean 
     //To get the value of any particular key use .get("keyNAme") function..
     //returns the value stored for that key returns NULL if not exist
     if(map.containsKey("India")){
        System.out.println("Key is there");
     } else{
        System.out.println("Key is not present");
     }
     System.out.println(map.get("Turkey"));
     /*to iterate over a HASHMAP we use iterable for loop
      * where in place of data type we write.. Map.Entry<KEY_dataType, VALUE_dataType
      in place of variable i we write "e"
      and after :map.entrySet()
      */
    for(Map.Entry<String, Integer> e:map.entrySet())
    {   
        //prints both key=value
        System.out.println(e); 
        //prints only key
        System.out.println(e.getKey());
        //prints only value
        System.out.println(e.getValue());
    }
    //to remove any element
    map.remove("USA");
    System.out.println(map);
}
}
