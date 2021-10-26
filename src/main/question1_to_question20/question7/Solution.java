package question1_to_question20.question7;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(1534236469));
    }
    public int reverse(int x) {
        boolean isMinus = false;
        if (x < 0) {
            isMinus = true;
            x = Math.abs(x);
        }

        long resoult = 0;
        do {
            resoult = resoult*10 + x%10;
            x = x/10;
        } while (x != 0);

        resoult = isMinus? 0-resoult:resoult;

        if (resoult < -Math.pow(2,31) || resoult > Math.pow(2,31)-1){
            return 0;
        }

        return (int) resoult;
    }
}
