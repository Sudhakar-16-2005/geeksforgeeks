// User function Template for Java

class Solution {
    int totalCount(int k, int[] arr) {
        int sum = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] % k==0)
            sum+=arr[i]/k;
            else 
            sum+=arr[i]/k +1;
        }
        return sum;
    }
}
