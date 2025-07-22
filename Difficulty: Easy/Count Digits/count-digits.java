// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        
        String s = n+"";
        
        int count=0;
        for(char ch : s.toCharArray()){
            int digit = ch-'0';
            if(digit == 0) continue;
            if(n%digit == 0) count++;
        }
        
        return count;
    }
}