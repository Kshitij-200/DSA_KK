package recurSion;

public class recursion_level_1_questions {
    public static void nto1(int n){
        if (n == 1){
            System.out.print(1 + " ");
            return;
        }
        System.out.print(n + " ");
        nto1(n - 1);


    }

    public static void oneton(int n){
        if (n == 1){
            System.out.print(1 + " ");
            return;
        }
        else{
            oneton(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void funBoth(int n){
        if (n == 1){
            System.out.print(1 + " ");
            return;
        }
        else{
            System.out.print(n + " ");
            funBoth(n - 1);
            System.out.print(n + " ");
//            funBoth(n - 1);
        }
    }


    public static void product1ton(int n){

    }
    public static void main(String[] args) {
//        nto1(10);
//        oneton(10);
        funBoth(10);
    }
}
