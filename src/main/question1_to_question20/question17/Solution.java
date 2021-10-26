package question1_to_question20.question17;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.letterCombinations("234"));
    }

    public List<String> letterCombinations(String digits) {
        List<String> tempList = new ArrayList<>();
        String[] letters = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for (int i = 0; i < digits.length(); i++) {
            String letter = letters[digits.charAt(i)-'2'];
            if (tempList.isEmpty()) {
                tempList = Arrays.asList(letter.split(""));
            } else {
                tempList = tempList.stream().flatMap(item -> Arrays.asList(letter.split("")).stream().map(item2 -> item  + item2)).collect(Collectors.toList());
            }
        }
        return tempList;

    }

}
