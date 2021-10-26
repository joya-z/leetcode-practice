package question20;


public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("{[]}"));
    }

    public boolean isValid(String s) {
        char[] chars = new char[s.length()];
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '(' || s.charAt(j) == '[' || s.charAt(j) == '{') {
                chars[i] = s.charAt(j);
                i++;
            } else {
                if (i == 0)  {
                    return false;
                }
                if (s.charAt(j) == ')' && chars[i-1] != '(') {
                    return false;
                }
                if (s.charAt(j) == ']' && chars[i-1] != '[') {
                    return false;
                }
                if (s.charAt(j) == '}' && chars[i-1] != '{') {
                    return false;
                }
                i--;
            }
        }
        if (i !=0 ) {
            return false;
        }
        return true;
    }

}
