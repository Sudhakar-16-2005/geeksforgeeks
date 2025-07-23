class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i:arr){
            int count = m.getOrDefault(i,0);
            m.put(i,count+1);
            if(count>=1){
                res.add(i);
            }
            
        }
        return res;
        
    }
}
