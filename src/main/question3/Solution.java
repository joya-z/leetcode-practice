package question3;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
    }

    public int lengthOfLongestSubstring(String s) {
        int maxlength =0;
        String subStr = "";
        for (int i = 0; i < s.length(); i++) {
            int index =subStr.indexOf(String.valueOf(s.charAt(i)));
            if (index>-1) {
                subStr = subStr.substring(index+1)+s.charAt(i);
            } else {
                subStr = subStr + s.charAt(i);
            }
            maxlength = subStr.length() > maxlength ? subStr.length() : maxlength;
        }
        return maxlength;
    }


}
