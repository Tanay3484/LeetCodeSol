class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> freqMap = new HashMap<Integer,Integer>();
        for(int i : nums){
            if(freqMap.containsKey(i)){
                freqMap.put(i,freqMap.get(i)+1);
            }
            else{
                freqMap.put(i,1);
            }
        }
        
        int major = 0;
        
        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            if(entry.getValue()>Math.floor(n/2)){
                major = entry.getKey();
            }
        }
            
        return major;
    }
}