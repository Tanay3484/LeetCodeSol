class SummaryRanges {
    private TreeMap<Integer, Boolean> treeMap;
    
    public SummaryRanges() {
       treeMap = new TreeMap<>(); 
    }
    
    public void addNum(int value) {
        treeMap.put(value,true);
    }
    
    public int[][] getIntervals() {
        List<int[]> res = new ArrayList<>();
        Integer prev = null;
        for(Integer n : treeMap.keySet()){
            if(prev!=null && prev+1 == n){
                res.get(res.size()-1)[1] = n;
            }else{
                int[] interval = new int[2];
                interval[0] = n;
                interval[1] = n;
                res.add(interval);
            }
            prev = n;
        }
        int[][] resultArray = new int[res.size()][2];
        for(int i = 0;i<res.size();i++){
            resultArray[i] = res.get(i);
        }
        return resultArray;
    }
}

/**
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(value);
 * int[][] param_2 = obj.getIntervals();
 */