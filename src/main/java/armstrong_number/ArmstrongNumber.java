package armstrong_number;

import static java.lang.Character.getNumericValue;
import static java.lang.Math.pow;

public class ArmstrongNumber {
    public static boolean isArmstrongNumber(int n) {
        String num = String.valueOf(n);

        int result = 0;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            int  tmp = Integer.valueOf(getNumericValue(c));
            result += pow(tmp, 3);
        }
        return result == n;
    }
}
