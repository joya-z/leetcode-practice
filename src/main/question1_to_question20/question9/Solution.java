package question1_to_question20.question9;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(1231));
    }
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int origin = x;
        int reverse = 0;

        while (x !=0){
            reverse = reverse*10 + x%10;
            x = x/10;
        }
        return origin == reverse;
    }
}
