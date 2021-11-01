package question_random.question260;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.singleNumber(new int[]{-1,0});
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public int[] singleNumber(int[] nums) {
        if (nums.length <=2) {
            return nums;
        }

        Arrays.sort(nums);
        int[] resoult = new int[] {nums[0],nums[nums.length-1]};
        int m = 0 ;
        for (int i = 0; i < nums.length-1; i++) {
            if (m ==2) {
                break;
            }
            if ((i==0||nums[i-1] != nums[i]) && nums[i] != nums[i+1]) {
                resoult[m] = nums[i];
                m++;
            }
        }

        return resoult;
    }

}
