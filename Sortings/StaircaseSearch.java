package Sortings;

public class StaircaseSearch {
    public static void main(String[] args) {

        int Array[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(Array[i][j] + "\t");
            }
            System.out.println();
        }
        int key = 33;
       boolean status= Search(Array, key);
       if(status==false){
        System.err.println("Key doesn't exist");
       }
    }

    public static boolean Search(int Array[][], int key) {
     int i=0,j=Array.length-1;
     while (i<Array.length && j>=0) {
          if(key==Array[i][j]){
             System.out.println("Key found at (" +i+","+j+") position");
             return true;
          }else if(key>(Array[i][j])){
                 //move to bottom
                 i++;
             }else{
                 //move ot left
                 j--;
             }
     }
      return false;
    }
}
