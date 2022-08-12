package prime_number;


public class PrimeNumber {
    public static boolean isPrimeNumber(int n){
        if (n <= 1) return false;

        //checks if has more than one divider
        for (int i = 2; i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

}
