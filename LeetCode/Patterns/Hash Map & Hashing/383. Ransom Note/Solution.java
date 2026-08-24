class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character , Integer> map1 = new HashMap<>();
        HashMap<Character , Integer> map2 = new HashMap<>();

        for(int i =0;i<magazine.length();i++){
            char ch1 = magazine.charAt(i);

            map1.put(ch1 , map1.getOrDefault(ch1 , 0)+1);
        }
        for(int i =0;i<ransomNote.length();i++){
            char ch2 = ransomNote.charAt(i);

            map2.put(ch2 , map2.getOrDefault(ch2 , 0) +1);
        }
        for( Character key : map2.keySet()){
            if(map2.get(key) > map1.getOrDefault(key , 0)){
            return false;
            }
        }
        
        return true;
    }
}