class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int l = 0,r = nums.length-1;
        helper(nums,l,r);
        
        l = 0;
        r = k-1;
        helper(nums,l,r);
        
        l = k;
        r = nums.length-1;
        helper(nums,l,r);
        
    }
    
    public void helper(int[] nums,int l, int r){
        while(l<r){
            nums[l] = nums[l]^nums[r];
            nums[r] = nums[l]^nums[r];
            nums[l] = nums[l]^nums[r];
            l++;
            r--;
        }
    }
}