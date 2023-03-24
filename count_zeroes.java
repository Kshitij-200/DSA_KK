package recurSion;

public class count_zeroes {
    public static int countZeroes(int n){
//        if (n % 10 == n){
//            return 0;
//        }
        return helper(n,0);
    }
    private static int helper(int n, int count){
        if (n == 0){
            return count;
        }
        int rem = n % 10;
        if (rem == 0){
            return  helper(n / 10, ++count);
        }
           return helper(n / 10, count);

    }

    public static void main(String[] args) {
        System.out.println(countZeroes(3000));
    }
}
