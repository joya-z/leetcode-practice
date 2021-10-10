package question1;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] resoult = new int[2];

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target) {
                    resoult[0] = i;
                    resoult[1] = j;
                    return resoult;
                }
            }
        }

        return  resoult;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.twoSum(new int[]{2, 7, 11, 15}, 17);
        System.out.println(ints[0]+"\t"+ints[1]);
    }
}
