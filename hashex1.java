import java.util.HashMap;

public class hashex1 {
    public static void main(String[] args) {
        String str = "hello world hello java";
        String[] words = str.split(" ");
        HashMap<Integer, String> indexMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            indexMap.put(i, words[i]);
        }
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : indexMap.values()) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        for (String word : wordCount.keySet()) {
            System.out.println(word + " -> " + wordCount.get(word));
        }
    }
}
