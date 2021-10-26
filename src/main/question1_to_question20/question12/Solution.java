package question1_to_question20.question12;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.intToRoman(1994));
    }


    public String intToRoman(int num) {
        String[] str = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] ints ={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i < ints.length && num >0){
            while (num >= ints[i]){
                num = num - ints[i];
                sb.append(str[i]);
            }
            i ++;
        }
        return sb.toString();
    }
}
