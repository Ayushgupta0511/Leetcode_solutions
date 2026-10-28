class Solution {
    public int beautySum(String s) {
        
        StringBuilder ans = new StringBuilder();
        int sum =0;
        int beauty= 0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                HashMap<Character, Integer> map = new HashMap<>();
                ans = new StringBuilder(s.substring(i , j+1));
                for(char ch : ans.toString().toCharArray()){
                    map.put(ch, map.getOrDefault(ch, 0) + 1);
                }
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