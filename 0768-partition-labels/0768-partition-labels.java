class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] last=new int[26];
        List<Integer> ans=new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            last[s.charAt(i)-'a']=i;
        }
        int end=0, start=0;

        for(int i=0; i<s.length(); i++){
            end=Math.max(end,last[s.charAt(i)-'a']);

            if(i==end){
                ans.add(end-start+1);
                start=i+1;
                end=0;
            }
        }
        return ans;
    }
}