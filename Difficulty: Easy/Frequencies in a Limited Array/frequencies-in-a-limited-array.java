class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        int [] res=new int[arr.length];
        List<Integer>num = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            res[arr[i] - 1] += 1;
        }
        
        for (int i:res){
            num.add(i);
        }
        return num;
    }
}
