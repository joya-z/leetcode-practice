package question1_to_question20.question15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.threeSum(new int[]{0,0,0}));
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List result = new ArrayList();
        if (nums.length<3){
            return result;
        }

        Arrays.sort(nums);

        for (int i = 0; nums[i] <= 0 && i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int m = j+1; m < nums.length; m++) {
                    if (nums[m]>=0 && nums[i] + nums[j]+nums[m] ==0){
                        result.add( Arrays.asList(nums[i], nums[j],nums[m]));
                    }
                }
            }
        }


        return (List<List<Integer>>) result.stream().distinct().collect(Collectors.toList());
    }
}
