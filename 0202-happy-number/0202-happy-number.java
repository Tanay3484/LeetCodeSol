class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> visit = new HashSet<Integer>();
        while(!visit.contains(n)){
            visit.add(n);
            n = sumOfSquares(n);
            
            if(n==1) return true;
        }
        return false;
    }
    
    public int sumOfSquares(int n){
        int output = 0;
        while(n!=0){
            int digit = n%10;
            output = output+(digit*digit);
            n = n/10;
        }
        return output;
    }
}