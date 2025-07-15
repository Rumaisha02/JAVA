public class Frequencyin2dArray {
    public static void main(String[] args) {
        int array[][]={{6,7},{7,3}};
         for (int i = 0; i <array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        int target=7;
        CountFrequency(array,target);
    }

    public static void CountFrequency(int[][] array, int target){
        System.out.println("FUCK");
        int  i=0,j=array.length-1, count=0;
        while (i<array.length && j>=0) {
          if(target==array[i][j]){
             count++;
          }else if(target>(array[i][j])){
                 //move to bottom
                 i++;
             }else{
                 //move ot left
                 j--;
             }
     }
         System.out.println("Frequency of "+target+" is "+ count);

    }
}
