class Solution {
    public static void count(int index,String digits,String ans,HashMap<Character , String> map,List<String> list){
        if(ans.length() == digits.length()){
            list.add(ans);
            return;
        }
        char ch = digits.charAt(index);
        String s = map.get(ch);
        for(int i=0;i < s.length();i++){
            ans = ans + s.charAt(i);
            count(index+1,digits,ans,map,list);
            ans = ans.substring(0, ans.length() - 1);
        }
    }


    public List<String> letterCombinations(String digits) {
    HashMap<Character, String> map = new HashMap<>();
    map.put('2', "abc");
    map.put('3', "def");
    map.put('4', "ghi");
    map.put('5', "jkl");
    map.put('6', "mno");
    map.put('7', "pqrs");
    map.put('8', "tuv");
    map.put('9', "wxyz");
    int index =0;
    String ans = "";
    List<String> list = new ArrayList();
    count(index,digits,ans,map,list);
    return list;
    }
}