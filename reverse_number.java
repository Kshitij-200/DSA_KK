package recurSion;

public class reverse_number {
    static int sum = 0;
    public static void funReverse(int n){
        if (n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        funReverse(n / 10);
    }

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
    public static void main(String[] args) {
//        funReverse(54321);
//        System.out.println(sum);
        System.out.println(funReverse_2(54321));
    }
}
