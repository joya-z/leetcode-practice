package question8;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myAtoi("9223372036854775808"));
    }
    public int myAtoi(String s) {
        double result = 0;
        boolean isMinus = false;
        boolean isNums = false;
        for (int i = 0; i < s.length(); i++) {
            if (isNums && !isNum(s.charAt(i))){
                break;
            }

            if (s.charAt(i) == ' '){
                continue;
            }
            if (s.charAt(i) == '+') {
                isNums = true;
            } else if (s.charAt(i)=='-') {
                isMinus = true;
                isNums = true;
            } else if (isNum(s.charAt(i))) {
                result = result *10 + (s.charAt(i)-'0');
                isNums = true;
            } else {
                break;
            }
        }
        result = isMinus ? -result : result;
        double max = Math.pow(2, 31);
        result = result < -max ? -max :result;
        result = result > max-1 ? max -1 : result;

        return (int)result;
    }
    private boolean isNum(char c){
        return c >= '0' && c <= '9';
    }
}
