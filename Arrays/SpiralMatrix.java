

public class SpiralMatrix {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        for(int i=0;i<matrix.length;i++){
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+ "\t");
            }
            System.out.println();
        }

        Spiral(matrix);

    }

    public static void Spiral(int matrix[][]){
        int n=matrix.length;
        //initialize the starting conditions
         int startRow=0, endRow=n-1 ,startCol=0,endCol=n-1;

         //loop to print the spiral
         while (startRow<=endRow && startCol<=endCol) {
            //top
            for (int j = startCol; j <=endCol; j++) {
                System.out.print(matrix[startRow][j]+" ");
            }

            //Right
            for (int i = startRow+1; i <=endRow; i++) {
                System.out.print(matrix[i][endCol]+" ");
            }

            //bottom
            for (int j = endCol-1; j>=startCol; j--) {
                if(startRow==endRow){break;}
                System.out.print(matrix[endRow][j]+" ");
            }

            //left
            for (int i = endRow-1; i>=startRow+1; i--) {
                if (startCol==endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            startCol++;startRow++;
            endCol--;endRow--;
         }
         System.out.println();
    }
}
