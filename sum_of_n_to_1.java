package recurSion;

public class sum_of_n_to_1 {
    public static int  nto1(int n){
        if(n == 1){
            return 1;
        }
        return n + nto1(n - 1);
    }
    public static void main(String[] args) {
        int ans = nto1(5);
        System.out.println(ans);
    }
}
