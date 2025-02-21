import java.util.*;
// import java.util.Iterator;
public class Hashing {
    public static void main(String[] args){
     HashSet<Integer> set=new HashSet<>();
     for (int index = 0; index <=10; index++) {
        set.add(index);
     }
    Iterator it = set.iterator();
     
     while(it.hasNext()){
        System.out.println(it.next());
    }
    }
}
