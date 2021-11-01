package question_random.question500;


public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"Hello","Alaska","Dad","Peace"};
        String[] words1 = solution.findWords(words);
        for (int i = 0; i < words1.length; i++) {
            System.out.println(words1[i]);
        }
    }

    public String[] findWords(String[] words) {
        StringBuffer sb = new StringBuffer();
        String[] keys = {"qwertyuiop","asdfghjkl","zxcvbnm"};
        for (int i = 0; i < keys.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (keyContainWords(keys[i],words[j].toLowerCase())) {
                    sb.append(" ").append( words[j]);
                }
            }
        }

        return  sb.length() > 1 ? sb.substring(1).split(" ") : new String[]{};
    }

    private boolean keyContainWords(String key, String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!key.contains(word.subSequence(i,i+1))) {
                return false;
            }
        }
        return true;
    }

}
