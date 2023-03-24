package recurSion;

public class palindrome {
    public static int funReverse_2(int n){

        int digits = (int)Math.log10(n) + 1;
        return helper(n, digits);
    }
    private static int helper(int n, int digits){
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)Math.pow(10, digits - 1) + helper(n /10, digits - 1);
    }
    public static boolean palindrome_n(int n){
        return (n == funReverse_2(n));
    }
    public static void main(String[] args) {
        System.out.println(palindrome_n(12321));
    }
}
