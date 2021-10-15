package question11;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxArea(new int[]{4,3,2,1,4}));
    }
    public int maxArea(int[] height) {

        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l<r) {
            int area = Math.min(height[l],height[r]) * (r-l);
            ans = Math.max(area,ans);
            if (height[l] <= height[r]){
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }

}
