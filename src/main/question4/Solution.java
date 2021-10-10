package question4;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(solution.findMedianSortedArrays(nums1, nums2));
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sum = nums1.length + nums2.length;

        int[] nums = new int[sum];
        int i = 0;
        int j = 0;
        int m = 0;
        while (i < nums1.length && j< nums2.length){
            if (nums1[i] < nums2[j]){
                nums[m] = nums1[i];
                i++;
                m++;
            } else {
                nums[m] = nums2[j];
                j++;
                m++;
            }
        }
        while (i < nums1.length){
            nums[m] = nums1[i];
            i++;
            m++;
        }
        while (j<nums2.length){
            nums[m] = nums2[j];
            j++;
            m++;
        }

        if (sum%2==1){
            return nums[sum/2]*1.0;
        } else {
            return (nums[sum/2-1]+ nums[sum/2])/2.0;
        }
    }
}
