package fibonacci;

public class Fibonacci {
    public int solution(int N){
        if(N <= 1) return N;
        int n1 = 0;
        int n2 = 1;


        int n3 = 0;
        for (int i = 2; i <= N ; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }
}
