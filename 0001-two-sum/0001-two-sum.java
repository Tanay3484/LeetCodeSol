class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] res = new int[2];
        for(int i = 0;i<nums.length;i++){
            if(map.isEmpty()){
                map.put(nums[i],i);
            }
            else{
                int diff = target-nums[i];
                if(map.containsKey(diff)){
                    res[0] = map.get(diff);
                    res[1] = i;
                    break;
                }
                else{
                    map.put(nums[i],i);
                }
            }
        }
        return res;
    }
}