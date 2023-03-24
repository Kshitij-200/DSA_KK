package recurSion;

public class sumof_Digits {
    public static int sumofDigits(int n){
        if(n == 0){
            return 0;
        }
        int d1 = n % 10;
        int d2 = n/10;
        return d1 + sumofDigits(d2);
    }

    public static int productofDigits(int n){
        if(n%10== n){
            return n;
        }
        int d1 = n % 10;
        int d2 = n / 10;
        return d1 * productofDigits(d2);
    }
    public static void main(String[] args) {
//        int ans = sumofDigits(123);
//        System.out.println(ans);

        int ans2 = productofDigits(123);
        System.out.println(ans2);
//        System.out.println(123/10);
    }
}
