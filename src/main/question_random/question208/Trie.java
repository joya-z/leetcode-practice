package question_random.question208;

import java.util.ArrayList;
import java.util.List;

public class Trie {
    private List<String>  list= null;
    public Trie() {
        this.list = new ArrayList<>();
    }

    public void insert(String word) {
        list.add(word);
    }

    public boolean search(String word) {
        return list.contains(word);
    }

    public boolean startsWith(String prefix) {
        return list.stream().filter(word -> word.startsWith(prefix)).findAny().isPresent();
    }
}
