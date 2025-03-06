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

    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
            System.out.println("Enter n");
            int n=sc.nextInt(); int p=0;
            for (int i = 1; i <=n; i++) {
                for(int j=1;j<=i;j++){
                    p++;
                    System.out.print(p+" ");
                  
                }
                System.out.println();
            }
            sc.close();
    }
    
}



