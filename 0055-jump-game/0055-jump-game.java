class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length-1;
        for(int i = nums.length-1;i>-1;i--){
            if(i+nums[i]>=goal){
                goal = i;
            }
        }
        
        if(goal==0){
            System.gc();
            return true;
        }
        else{
            System.gc();
            return false;
        }
    }
}