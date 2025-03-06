import java.util.*;
public class Pattern1 {

    //PATTER1
    // public static void main(String[] args){
    //     Scanner sc=new Scanner (System.in);
    //     System.out.println("Enter n");
    //     int n=sc.nextInt();
    //     for (int i = 1; i<=n; i++) {
    //        for(int j=1;j<=i;j++){
    //         System.out.print(j);
    //        } 
    //        System.out.println();
    //     }
    //     sc.close();
    // }


    // PATTERN2
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner (System.in);
    //     System.out.println("Enter n");
    //     int n=sc.nextInt();
    //     for(int i=0;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    //     sc.close();
    // }

    // public static void main(String[] args){
    //     Scanner sc=new Scanner (System.in);
    //         System.out.println("Enter n");
    //         int n=sc.nextInt(); int p=0;
    //         for (int i = 1; i <=n; i++) {
    //             for(int j=1;j<=i;j++){
    //                 p++;
    //                 System.out.print(p+" ");
                  
    //             }
    //             System.out.println();
    //         }
    //         sc.close();
    // }

    // public static void main(String[] args){
    //         Scanner sc=new Scanner (System.in);
    //             System.out.println("Enter n");
    //             int n=sc.nextInt();
    //             for(int i=1;i<=n;i++){
    //               /*
    //                *   //alternative way is..
    //                * if i+j=even  PRINT 1
    //                * if i+j=odd PRINT 0
    //                */
    //                for(int j=1;j<=i;j++){
    //                 if(i==j){
    //                     System.out.print("1" + " ");
    //                 }
    //                 else if((i%2!=0 && j%2==0) || (i%2==0 && j%2!=0)){
    //                    System.out.print("0" + " ");
    //                 } 
    //                 else{
    //                     System.out.print("1" + " ");
    //                 }
    //             }
    //                 System.out.println();
    //             }
    //   sc.close();
    //  }

    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
            System.out.println("Enter n");
            int n=sc.nextInt();
            for (int i = 0; i <=n; i++) {
                 for (int j = 0; j <=n; j++) {
                    if(i+j==5 || i+j>5){
                        System.out.print("*"+ " ");
                    }else{
                        System.out.print(" ");
                    }
                 }
                 for (int k = n; k >=i; k--) {
                    System.out.print("*" + " ");
                 }
                 System.out.println();
            }

            sc.close();
        }

}



