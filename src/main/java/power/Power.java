package power;

public class Power {

    public int power(int x, int y){
        if(x == 0) return 0;

        int res = 1;
        for (int i = 1; i <= y; i++) {
            res *= x;
        }
        return res;
    }
}
