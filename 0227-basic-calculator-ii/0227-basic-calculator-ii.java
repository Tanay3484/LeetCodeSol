class Solution {
    public int calculate(String s) {
        int i = 0;
        int cur=0,prev=0,res=0;

        char cur_operation = '+';

        while(i<s.length()){
            char cur_char = s.charAt(i);

            if(Character.isDigit(cur_char)){
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    cur = cur*10+Integer.parseInt(String.valueOf(s.charAt(i)));
                    i++;
                }
                i--;
                if(cur_operation=='+'){
                    res+=cur;
                    prev = cur;
                }
                else if(cur_operation=='-'){
                    res -= cur;
                    prev = -cur;
                }
                else if(cur_operation=='*'){
                    res -= prev;
                    res += prev*cur;
                    prev = cur*prev;
                }
                else{
                    res -= prev;
                    res += (prev/cur);
                    prev = (prev/cur);
                }
                cur = 0;
            }
            else if(cur_char != ' '){
                cur_operation = cur_char;
            }
            i++;
        }

        return res;
    }
}