package factorial;

public class Factorial {

    public int factorial(int n){
        if (n <= 1) return 1;

        int res = 1;
        for (int i = 1; i <= n ; i++) {
            res *= i;
        }
        return res;
    }

}
