class Solution {
    static int days(int[] bloomDay ,int mid , int k ){
        int count =0;
        int ans =0;
        for(int i =0;i<bloomDay.length;i++){
            if(bloomDay[i] <= mid){
                count++;
            }
            else {
                ans = (count / k) + ans;
                count =0;
            }
        }
        ans = (count / k) + ans;
        return ans;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int tf = bloomDay.length;
        int soln =0;
        int low = Arrays.stream(bloomDay).min().getAsInt();
        int high = Arrays.stream(bloomDay).max().getAsInt();
        int p = high;
        if(m*k > tf){
            return -1;
        }
         while(low <= high){
            int mid = low + (high - low)/2;
            soln = days(bloomDay ,mid , k);
            if(soln >= m){
                p = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
            // if(soln == m){
            //     return mid;
            // }
         }
        return p;
    }
}