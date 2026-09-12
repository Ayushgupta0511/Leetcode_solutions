class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int q = piles.length;
        int count =0;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<q;i++){
            if(piles[i] > max){
                max = piles[i];
            }
        }
        for(int i =1;i<=max;i++){
            count =0;
                for(int w =0;w<q;w++){
                    count = count + (piles[w] + i -1 ) /i;
                }
                if(count <= h){
                    return i;
                }
            
        }
        return 0;
    }
    
}