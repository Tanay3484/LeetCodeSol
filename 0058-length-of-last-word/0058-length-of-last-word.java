class Solution {
    public int lengthOfLastWord(String s) {
        s = s.strip();
        List<String> res = new ArrayList<String>(Arrays.asList(s.split(" ")));
        String lastWord = res.get(res.size()-1);
        
        return lastWord.length();
    }
}