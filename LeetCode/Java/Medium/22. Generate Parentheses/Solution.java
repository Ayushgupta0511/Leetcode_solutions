class Solution {
    static void generate(int n , int open , int close ,List<String> list , String current){
        if(current.length() == n*2){
            list.add(current);
            return;
        }
        if(open < n){
            // open++;
            generate(n,open+1,close,list,current + "(");
        }
        if(close < open){
            // close++;
            generate(n,open,close+1,list  ,current + ")");
        }
        return;
    } 
    public List<String> generateParenthesis(int n) {
        int open =0;
        int close = 0;
        String current = new String();
        List<String> list = new ArrayList<>(n*2);
        generate(n,open ,close ,list , current);
        return list;
    }
}