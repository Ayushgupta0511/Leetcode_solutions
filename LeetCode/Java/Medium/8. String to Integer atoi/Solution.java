class Solution {
    public int myAtoi(String s) {
        int i =0;
        int sign = 1;
        int num = 0;
        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }
        if( i < s.length()){
            if(s.charAt(i) == '-'){
                sign = -1;
                i++;
            }
            else if (s.charAt(i) == '+') {
                i++;
            }
        }
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            int Digit = s.charAt(i) - '0';
            num = num * 10 + Digit;
            i++;
        }
        return num * sign;
    }
}