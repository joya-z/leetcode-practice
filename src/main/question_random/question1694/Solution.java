package question_random.question1694;


public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reformatNumber("1-23-45 6"));
        System.out.println(solution.reformatNumber("123 4-567"));
        System.out.println(solution.reformatNumber("123 4-5678"));
        System.out.println(solution.reformatNumber("--17-5 229 35-39475"));
        System.out.println(solution.reformatNumber("12"));
    }

    public String reformatNumber(String number) {
        String number2 = number.replaceAll("-", "").replaceAll(" ", "");
        StringBuffer sb = new StringBuffer();
        int m =0,j = number2.length()-1;
        while (m <=j) {
            if (j-m ==3 || j-m ==1) {
                sb.append("-").append(number2.substring(m,m+2));
                m = m+2;
            }
            if (j-m >= 2){
                sb.append("-").append(number2.substring(m,m+3));
                m = m+3;
            }
        }
        return sb.length()>0 ? sb.substring(1) : "";
    }

}
