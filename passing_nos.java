package recurSion;

public class passing_nos {

    public static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        fun(--n);
    }
    public static void main(String[] args) {
//        fun(5);
        int n = 1832;
        int digits = (int)Math.log10(n) + 1;
        System.out.println(digits);
    }
}
