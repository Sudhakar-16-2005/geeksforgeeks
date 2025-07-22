// User function Template for Java

class Solution {
    public String removeConsecutiveCharacter(String s) {
        // code here
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i == 0 ||s.charAt(i)!= s.charAt(i-1)){
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}
