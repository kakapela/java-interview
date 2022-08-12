package palindrome;

public class Palindrome {

    public static boolean isPalindrome(String string){
        StringBuilder sb = new StringBuilder(string).reverse();
        return string.equals(sb.toString());
    }

    public static boolean isPalindrome2(String string){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = string.length()-1; i >= 0 ; i--) {
            stringBuilder.append(string.charAt(i));
        }
        return string.equals(stringBuilder.toString());
    }
}
