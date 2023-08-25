class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0||nums==null){
            return 0;
        }
        int l = 1;
        int r = 1;
        for(;r<nums.length;r++){
            if(nums[r]!=nums[r-1]){
                nums[l] = nums[r];
                l++;
            }
        }
        return l;
    }
}