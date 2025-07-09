import java.util.Arrays;

public class BuyNSell {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4},len=prices.length;
         Profit(prices,len);  
         SellStocks(prices,len);
    }

    public static void Profit(int prices[],int len){
        int BP[]=new int[len]; BP[0]=prices[0];
        int MaxP=0,day=0,profit;
        for (int i = 1; i < len; i++) {
            BP[i]=Math.min(BP[i-1], prices[i]);
        }
        System.out.println(Arrays.toString(BP));

        for (int i = 1; i < len; i++) {
            profit=prices[i]-BP[i-1];
            if(MaxP<profit){
                MaxP=profit;
                day=i;
            }
        }

        System.out.println("Maximum profit will be made rupess "+MaxP+ " on day "+ day);
    }



    public static void SellStocks(int prices[],int len){
        int BuyingP=Integer.MAX_VALUE;
        int MAXP=0,profit=0;;

        for (int i = 0; i < len; i++) {
            if(BuyingP<prices[i]){
                profit=prices[i]-BuyingP;
                MAXP=Math.max(MAXP, profit);
            }else{
                BuyingP=prices[i];
            }
        }

        System.out.println("Maxmimum profit using optimized approach= " +MAXP);
    }

}
