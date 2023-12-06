class Solution {
    List<List<Integer>> ans =new ArrayList<>();
    ArrayList<Integer> ls = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] c, int t) {
        cum(c,t,0);
        return ans;
    }
    public void cum(int[] c, int t, int s){
        if(t==0){
            ans.add(new ArrayList<>(ls));
            return;
        }
        for(int i=s; i<c.length; i++){
            if(c[i]<=t){
                ls.add(c[i]);
                cum(c,t-c[i],i);
                ls.remove(ls.size()-1);
            }
        }
    }
}