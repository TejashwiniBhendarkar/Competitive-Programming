class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
       int n=nums.size();
       int ans[]=new int[n];
       for(int i=0;i<n;i++){
         boolean found=false;
         int curr=nums.get(i);
          for(int x=0;x<=curr;x++){
            if((x|(x+1))==curr){
                ans[i]=x;
                found=true;
                break;
            }
          }
          if(!found){
            ans[i]=-1;
          }
       }
       return ans;
    }
}
