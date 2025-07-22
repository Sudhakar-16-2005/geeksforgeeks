// User function Template for Java

class Solution {
    public int minOperation(int n) {
        // code here.
         
        int count=1;
        while(n!=1){
            
            if(n%2 ==0) {
                n=n/2;
                count++;
            }
            else {
                n-=1;
                count++;
            }
        }
        return count;
    }
}