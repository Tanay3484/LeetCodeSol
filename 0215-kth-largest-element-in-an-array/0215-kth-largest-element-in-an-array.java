class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int n:nums){q.add(n);}
        for(int i = 1;i<k;i++){q.poll();}
        return q.poll();
    }
}