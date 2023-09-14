class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int n : stones){
            maxHeap.add(n);
        }
        
        while(maxHeap.size()>1){
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();
            if(stone1!=stone2){
                maxHeap.add(stone1-stone2);
            }
        }
        
        return maxHeap.size()!=0?maxHeap.poll():0;
    }
}