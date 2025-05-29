class Solution {
    int convertfive(Integer num) {
        // Your code here
        String s=num.toString();
        s=s.replace('0','5');
        return Integer.parseInt(s);
        
        
    }
}