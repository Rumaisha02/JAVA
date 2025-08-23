public class PrimeNo {
    public static void main(String[] args) {
        int n=29,sqrt;
        sqrt= (int)Math.sqrt(n);
        for (int i = 2; i <=sqrt; i++) {
            if(n%i==0){
            System.out.println("Not Prime");
            }
        }
    }
}

