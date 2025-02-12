/* I/P= [0,0,2,1,2,1,0,1,1,2,0]
 * o/p=[0,0,0,0,1,1,1,1,2,2,2]*/
 //DIRECT APPROACH 
import java.util.Arrays;
public class DutchNFalgo{
public static void main(String[] args){
  int[] arr={2,0,2,1,1,0};
  int[] temp=new int[arr.length];
  int p=0;
  for(int i=0;i<3;i++){
    for(int j=0;j<arr.length;j++){
        if(arr[j]==i){
            temp[p++]=i;
        }
    }
  }
  System.out.println("OG" + Arrays.toString(arr));

  System.out.println("ANS" + Arrays.toString(temp));
}
}