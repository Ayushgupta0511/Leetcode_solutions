class Solution {
    public double myPow(double x, int n) {
        double ans =1;
        int f =0;
        if (n >=0){
            f =n;
        }
        else {
            f = -n;
        }
    for(int i =0;i<f;i++){
        if(n>=0){
            ans = ans * x; 
        }
        else {
            ans = ans * ((double)1/x);
        }
    }      
        return ans;
    }
    
}