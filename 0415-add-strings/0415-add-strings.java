class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;

        StringBuilder res = new StringBuilder();

        while(i>=0 || j>=0){
            int cur_i = i>=0 ? num1.charAt(i) - '0' : 0;
            int cur_j = j>=0 ? num2.charAt(j) - '0' : 0;

            int curSum = carry+cur_i+cur_j;

            res.append(curSum%10);

            carry = curSum/10;

            i--;
            j--;
        }
        if(carry>0){
            res.append(carry);
        }
        return res.reverse().toString();
    }
}