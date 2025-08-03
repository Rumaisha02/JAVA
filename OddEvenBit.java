/*to find no is odd or even using bit manipulation*/


public class OddEvenBit {
    public static void main(String[] args) {
       oddOReven(33);
       oddOReven(144);
    }
    public static void oddOReven(int n){
        int bitmask=1;
        if(( n & bitmask ) == 0){
            System.out.println( n+ " no is EVEN no");
        }else{
          System.out.println(n+ " no is ODD no");
        }
    }
}
