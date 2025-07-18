// User function Template for Java

class Solution {
    public int maxProduct(int n) {
        // Your code goes here
        
        if(n == 2)
            return 1;
            if(n == 3)
            return 2;
            
            int prod=1;
            
            while(n>4){
                prod *=3;
                n -= 3;
            }
             prod *=n;
             return prod;
        
        
    }
};