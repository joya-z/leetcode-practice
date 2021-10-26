package question1_to_question20.question13;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("LVIII"));
    }

    public int romanToInt(String s) {
        String str = "MDCLXVI";
        int[] ints ={1000,500,100,50,10,5,1};

        int result = 0;
        int lastIndex = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            int index = str.indexOf(String.valueOf(s.charAt(i)));
            if (i+1<s.length() && index > lastIndex) {
                result -= ints[index];
            } else {
                result += ints[index];
            }
            lastIndex = index;
        }
        return result;
    }
}
