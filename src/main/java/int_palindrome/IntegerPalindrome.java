package int_palindrome;

public class IntegerPalindrome {
    public boolean isPalindrome(int n){
        String s = String.valueOf(n);
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = s.length() - 1; i >= 0 ; i--) {
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString().equals(s);
    }
}
