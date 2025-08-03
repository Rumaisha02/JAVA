/*to find no is odd or even using bit manipulation*/


public class OddEvenBit {
    public static void main(String[] args) {
       oddOReven(144);
       GetiTHbit(10,2);
    }
    public static void oddOReven(int n){
        int bitmask=1;
        if(( n & bitmask ) == 0){
            System.out.println( n+ " no is EVEN no");
        }else{
          System.out.println(n+ " no is ODD no");
        }
    }
    public static void GetiTHbit(int n , int i){
     int bitmask=1<<i;
     if((n&bitmask)==0){
        System.out.println("iTh bit is: 0");
     }else{
        System.out.println("iTh bit is: 1");
     }
    }
}
