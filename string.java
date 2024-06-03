public class string {
}


class Solution {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        if(s.length() == 1 && s.charAt(0) >= 'a' && s.charAt(0) <= 'z') return true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                sb.append(s.charAt(i));
            }
        }
        int n = sb.length();
        if (n < 2) return false;
        else if (sb.isEmpty()) return true;
        for (int i = 0; i < n/2; i++) {
            if (sb.charAt(i) != sb.charAt(n-i-1)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(" is palindrome :" + isPalindrome(" "));
    }
}