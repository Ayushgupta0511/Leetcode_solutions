class Solution {
    public static void count(int index,List<Integer> list , int sum , int k,int n , List<List<Integer>> parent){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        if(list.size() == k){
            if(sum == n){
                parent.add(new ArrayList(list));
            }
            return;
        }
        if(index < 9){
            if(list.size() <= k) {
        sum = sum + arr[index];
        list.add(arr[index]);
        count(index+1,list,sum,k,n , parent);
        sum = sum - arr[index];
        list.remove(list.size()-1);
        count(index+1,list,sum,k,n , parent);
            }
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        int index=0;
        int sum =0;
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> parent = new ArrayList<>();
        count(index,list,sum,k,n , parent);
        return parent;
    }
}