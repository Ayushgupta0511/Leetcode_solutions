class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int last = 0;
        int tinde = x;
        while(x>0){
            last = x%10;
            rev = rev*10 + last;
            x = x/10;
        }
        if(rev == tinde ) return true;
        else return false;
    }
}