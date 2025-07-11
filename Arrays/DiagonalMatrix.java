public class DiagonalMatrix {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        for(int i=0;i<matrix.length;i++){
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+ "\t");
            }
            System.out.println();
        }
        Diagonal(matrix);


        
    }

    //Time complexity= O(n square)
    public static void Diagonal(int matrix[][]){
        int n=matrix.length,PD=0,SD=0;
        // System.out.println("LENGTH:"+ n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if(i==j){
                    PD+=matrix[i][j];
                }
                if((i+j)==(n-1)){
                    SD+=matrix[i][j];
                }
            }
        }

        System.out.println("Primary Diagonal:"+PD+" Seconddary Diagnoal:"+SD);
        int DiagnoalSum=PD+SD;
         if((n%2)!=0){
            int middle=(n-1)/2;
            // System.out.println(matrix[middle][middle]);
            DiagnoalSum=DiagnoalSum-matrix[middle][middle];
         }

        System.out.println("Sum of Diagonals:"+DiagnoalSum);

    }



    //time complexity= O(n)
    public static void DiagonalOptimized(int matrix[][]){
          int n=matrix.length,PD=0,SD=0;
        // System.out.println("LENGTH:"+ n);
        for (int i = 0; i < n; i++) {
                    PD+=matrix[i][i];
                    SD+=matrix[i][(n-1)-i];
        }
         System.out.println("Primary Diagonal:"+PD+" Seconddary Diagnoal:"+SD);
        int DiagnoalSum=PD+SD;
         if((n%2)!=0){
            int middle=(n-1)/2;
            // System.out.println(matrix[middle][middle]);
            DiagnoalSum=DiagnoalSum-matrix[middle][middle];
         }

        System.out.println("Sum of Diagonals:"+DiagnoalSum);
    }
}
