class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1,right = 1;
        for(int pile:piles){
          right = Math.max(right,pile);
        }

        while(left<right){
          int mid = (left+right)/2;

          int hour = 0;

          for(int pile:piles){
            hour+=Math.ceil((double)pile/mid);
          }

          if(hour<=h){
            right=mid;
          }else{
            left = mid+1;
          }
        }

        return right;
    }
}