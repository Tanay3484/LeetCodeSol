class Solution {
    public boolean canCross(int[] stones) {
        HashMap<Integer,HashSet<Integer>> map = new HashMap<Integer,HashSet<Integer>>();
        boolean flag = false;
        for(int s : stones){
            map.put(s,new HashSet<>());
        }

        map.get(stones[0]).add(1);

        for(int s : stones){
            HashSet<Integer> jumps = map.get(s);
            for(int jump : jumps){
                int position = s+jump;
                if(position == stones[stones.length-1]){
                    flag = true;
                    break;
                }
                if(map.containsKey(position)){
                    if(jump-1>0){
                        map.get(position).add(jump-1);
                    }
                    map.get(position).add(jump);
                    map.get(position).add(jump+1);
                }
            }
        }

        return flag;
    }
}