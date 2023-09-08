class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lp = 0;
        int rp = numbers.length-1;
        int[] res = new int[2];
        while(lp<rp){
            if(numbers[lp]+numbers[rp]>target){
                rp--;
            }
            else if(numbers[lp]+numbers[rp]<target){
                lp++;
            }
            else{
                res[0] = lp+1;
                res[1] = rp+1;
                break;
            }
        }
        
        return res;
    }
}