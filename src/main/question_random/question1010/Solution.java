package question_random.question1010;


import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] time = {60,60,60};
        System.out.println(solution.numPairsDivisibleBy60(time));
    }

    public int numPairsDivisibleBy60(int[] time) {
        int[] record = new int[60];
        int count = 0;
        for (int t : time) {
            t %=60;
            if (t != 0) {
                count += record[60-t];
            } else {
                count += record[t];
            }
            record[t]++;
        }
        return count;
    }

}
