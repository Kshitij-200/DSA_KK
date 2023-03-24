package recurSion;

public class count_steps {
    static int count = 0;
    public static int countSteps(int n, int count){
        if (n == 0){
            return count;
        }
        if (n % 2 == 0){
            return countSteps(n / 2,++count);
        }
        return countSteps(n - 1, ++count);
    }

    public static int countSteps_1(int n){
        if (n == 0){
            return count;
        }
        if (n % 2 == 0){
            ++count;
            return countSteps_1(n / 2);
        }
        ++count;
        return countSteps_1(n - 1);
    }
    public static void main(String[] args) {
//        System.out.println(countSteps(8,0));
        System.out.println(countSteps_1(8));


    }
}
