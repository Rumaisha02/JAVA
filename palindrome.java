class Solution {
    public static void main(String[] args){
    int n=-242;
    boolean result=isPalindrome(n);
        System.out.println(result);
        }
        public static boolean isPalindrome(int x) {
        int a, rev = 0;
        int dup=x;
        if(x<0){
            return false;
        }
        while (x>0) {
            a = x % 10;
            rev = (rev * 10) + a;
            x = x / 10;
        }
        if ( dup== rev) {
            return true;
        } else {
            return false;
        }
    }
}
