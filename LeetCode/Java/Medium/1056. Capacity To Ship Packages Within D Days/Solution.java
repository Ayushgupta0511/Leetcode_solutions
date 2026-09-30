class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high =  0;
        for(int i =0 ; i <weights.length;i++){
            high = high + weights[i];
        }
        while (low <= high){
            int mid = low + (high - low)/2;
            int testday =1;
            int testweight =0;
            for(int i =0 ; i <weights.length;i++){
                if(testweight + weights[i]  <= mid){
                    testweight = testweight + weights[i];
                }
                else {
                    testweight = weights[i];
                    testday++;
                }
            }
                if ( testday <= days){
                    high = mid - 1;
                }
                else {
                    low = mid +1;
                }
        }
        return low;
    }
}