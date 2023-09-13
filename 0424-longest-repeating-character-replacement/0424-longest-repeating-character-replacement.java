class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> count = new HashMap<Character,Integer>();
        int res = 0;
        int l = 0;
        for(int r = 0;r<s.length();r++){
            count.put(s.charAt(r),1+count.getOrDefault(s.charAt(r),0));
            if((r-l+1)-Collections.max(count.values())>k){
                count.put(s.charAt(l),count.get(s.charAt(l))-1);
                l++;
            }
            res = Math.max(res,(r-l+1));
        }
        return res;
    }
}