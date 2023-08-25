class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i:nums){
            if(i!=val){
                k++;
            }
        }

        for(int i = 0;i<nums.length;i++){
            if(nums[i]==val){
                nums[i] = -1;
            }
        }

        Arrays.sort(nums);
        reverse(nums);
        return k;
    }
    public void reverse(int[] array)
    {
 
        // Length of the array
        int n = array.length;
 
        // Swapping the first half elements with last half
        // elements
        for (int i = 0; i < n / 2; i++) {
 
            // Storing the first half elements temporarily
            int temp = array[i];
 
            // Assigning the first half to the last half
            array[i] = array[n - i - 1];
 
            // Assigning the last half to the first half
            array[n - i - 1] = temp;
        }
    }
}