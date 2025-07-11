class numberPyramid{
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int n=8;
        for(int i=1;i<=n;i++)
        {
            for(int l=n-i;l>=1;l--)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            for(int k=2;k<=i;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}