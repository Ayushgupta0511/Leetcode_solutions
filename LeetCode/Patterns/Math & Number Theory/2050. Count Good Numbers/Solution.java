class Solution {
    static long findpower(int a, long b){
        long result = 0;
        if(b==0){
            return 1;
        }
        long half = findpower(a,b/2);
        result = (half * half) % MOD;
        if(b % 2 ==1){
            result = (result * a) % MOD;
        }
        return result;
    }
    public int countGoodNumbers(long n) {
        long MOD = 1000000007L;
        long even = n/2 + n%2;
        long odd = n/2;
        long  x = findpower(4,odd);
        long y = findpower(5,even);
        long result = ((x % MOD)*(y%MOD) % MOD);
        return (int)(result % MOD);
    }
}