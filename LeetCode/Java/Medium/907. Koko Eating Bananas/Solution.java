class Solution {
 public long bananas(int[] piles, int mid){
    long hours = 0;{
        for(int i =0;i<piles.length;i++){
            hours = hours + (piles[i] + mid -1)/mid;
        }
        return hours;
    }
 }
    public int minEatingSpeed(int[] piles, int h) {
        int low =1;
        int high = Arrays.stream(piles).max().getAsInt();
        int ans = Integer.MAX_VALUE;
        long hours =0;
        while(low<=high){
            int mid = low + (high - low)/2;
            hours = bananas(piles , mid);
            if( hours <= h ){
                ans = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }

        }
        return ans;
    }
}