class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> output = new ArrayList<>();

        output.add(intervals[0]);

        for(int i = 1;i<intervals.length;i++){
            int[] currentInterval = intervals[i];
            int[] lastMerged = output.get(output.size() - 1);

            if(currentInterval[0] <= lastMerged[1]){
                lastMerged[1] = Math.max(lastMerged[1],currentInterval[1]);
            }else{
                output.add(currentInterval);
            }
        }

        return output.toArray(new int[0][1]);
    }
}