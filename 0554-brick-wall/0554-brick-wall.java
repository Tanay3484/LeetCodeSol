class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> countGaps = new HashMap<Integer,Integer>();
        countGaps.put(0,0);
        for(List<Integer> r:wall){
            int total = 0;
            r.remove(r.size()-1);
            for(Integer b:r){
                total+=b;
                if(countGaps.containsKey(total)){
                    countGaps.put(total,1+countGaps.get(total));
                }else{
                    countGaps.put(total,1);
                }
            }
        }
        return wall.size()-Collections.max(countGaps.values());
    }
}