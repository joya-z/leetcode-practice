package question14;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(new String[]{"ewflower","flow","flight"}));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length ==1) {
            return strs[0];
        }
        String longestPrefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String pre = strs[i-1];
            String next= strs[i];
            if (next.equals("")) {
                return "";
            }

            int preSize = pre.length();
            int nextSize = next.length();
            for (int j = 0; j < preSize; j++) {
                if (longestPrefix.length() <= j) {
                    break;
                }
                if (nextSize <= j) {
                    longestPrefix = next;
                    break;
                }
                if (pre.charAt(j) != next.charAt(j)) {
                    longestPrefix = pre.substring(0,j);
                    break;
                }
            }
            if (longestPrefix.equals("")) {
                break;
            }
        }
        return longestPrefix;
    }
}
