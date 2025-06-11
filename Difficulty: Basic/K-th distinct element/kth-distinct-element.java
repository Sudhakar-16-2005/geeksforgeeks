class Solution {
    public int KthDistinct(int[] nums, int k) {
        // Code here
      LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++)
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        
        if(hm.size()<k)return -1;
        int c = 0;
        int ans = -1;
        for(Integer i:hm.keySet()){
            if(hm.get(i)==1)c++;
            if(c==k && hm.get(i)==1){
               ans=i;
               break;
            }
        }
        return ans;
    }
}