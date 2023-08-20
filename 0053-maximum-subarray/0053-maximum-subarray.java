class Solution {
    public int maxSubArray(int[] nums) {
        int maxVal = nums[0];
        int currSum = 0;
        for(int i : nums){
            if(currSum<0){
                currSum = 0;
            }
            currSum += i;
            maxVal = Math.max(currSum,maxVal);
        }

        return maxVal;
    }
}