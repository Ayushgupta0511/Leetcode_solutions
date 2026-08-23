class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character , Integer> ch = new HashMap<>();
        HashMap<Character , Integer> ex = new HashMap<>();

        for(int i =0; i<magazine.length();i++){
            char element = magazine.charAt(i);
            ch.put(element , ch.getOrDefault(element , 0) + 1);
        }
        for(int j =0;j < ransomNote.length();j++){
            char ex2 = ransomNote.charAt(j);
            ex.put(ex2 , ex.getOrDefault(ex2 , 0) + 1);
        }
        for (Character key : ex.keySet()){
            if(ch.getOrDefault(key , 0) < ex.get(key)){
                return false;
            }
        }
        return true;
    }
}