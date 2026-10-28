class Solution {
    public int beautySum(String s) {
        
        StringBuilder ans = new StringBuilder();
        int sum =0;
        int beauty= 0;
        for(int i=0;i<s.length();i++){
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j=i;j<s.length();j++){
                ans = new StringBuilder(s.substring(i , j+1));
                    char ch = s.charAt(j);
                    map.put(ch, map.getOrDefault(ch, 0) + 1);
                int maxFreq = Collections.max(map.values());
                int minFreq = Collections.min(map.values());
                if(minFreq >= 1){
                    beauty = maxFreq - minFreq;
                    sum = sum + beauty;
                }
            }
        }
        return sum;
    }
}