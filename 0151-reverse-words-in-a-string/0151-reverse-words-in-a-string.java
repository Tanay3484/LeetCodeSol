public class Solution {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].equals(" ") && !words[i].isEmpty()) {
                res.append(words[i]).append(" ");
            }
        }
        
        return res.toString().trim();
    }
}
