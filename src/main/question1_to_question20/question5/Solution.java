package question1_to_question20.question5;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("babadada"));
    }

    public String longestPalindrome(String s) {
        int subSize = s.length();
        int i =0;
        while (subSize>1){
            i =0;
            while (i+subSize<=s.length()){
                String substring = s.substring(i, i+subSize);
                if (isPalindrome(substring)){
                    return substring;
                }
                i++;
            }
            subSize--;
        }
        return s.substring(0,1);
    }

    private boolean isPalindrome(String s) {
        if (s.length() < 2) {
            return true;
        }
        int i = 0;
        while (i <= s.length()/2){
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                return false;
            }
            i++;
        }
        return true;
    }
}
