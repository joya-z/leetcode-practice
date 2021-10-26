package question1_to_question20.question6;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convert("ABC", 2));
    }
    public String convert(String s, int numRows) {
        if (numRows ==1) {
            return s;
        }
        String[][] temp = new String[numRows][s.length()];
        int rows = 0;
        int lines = 0;
        boolean isRowAdd = true;
        for (int i = 0; i < s.length(); i++) {
            if (isRowAdd) {
                if (rows < numRows) {
                    temp[rows][lines] = String.valueOf(s.charAt(i));
                    rows++;
                } else {
                    rows = rows-2;
                    isRowAdd = false;
                }
            }

            if (!isRowAdd){
                lines ++;
                if (rows >0) {
                    temp[rows][lines] = String.valueOf(s.charAt(i));
                    rows--;
                } else {
                    temp[0][lines] = String.valueOf(s.charAt(i));
                    isRowAdd = true;
                    rows++;
                }
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                if (null != temp[i][j]) {
                    sb.append(temp[i][j]);
                }
            }
        }
        return sb.toString();
    }
}
