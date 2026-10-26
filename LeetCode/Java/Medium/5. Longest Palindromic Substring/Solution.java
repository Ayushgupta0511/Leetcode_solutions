class Solution {
    static boolean check(String s , int i , int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        StringBuilder rest = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            for(int j =i;j<s.length();j++){
                    if(check(s,i,j) == true){
                        if((j - i + 1) > rest.length()){
                            rest = new StringBuilder(s.substring(i, j+1));
                        }
                    }
            }
        }
        return rest.toString();
    }
}