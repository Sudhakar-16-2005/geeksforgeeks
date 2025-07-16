// User function Template for Java

class Solution {
    String uncommonChars(String s1, String s2) {
        // code here
           boolean[] str1 = new boolean[26]; 
        boolean[] str2 = new boolean[26]; 

        
        for (int i = 0; i < s1.length(); i++) {
            str1[s1.charAt(i) - 'a'] = true;
        }

        
        for (int i = 0; i < s2.length(); i++) {
            str2[s2.charAt(i) - 'a'] = true;
        }
             StringBuilder result = new StringBuilder();

        
        for (int i = 0; i < 26; i++) {
            if (str1[i] ^ str2[i]) { 
                result.append((char) (i + 'a'));
            }
        }

                if (result.length() == 0) return "";

        return result.toString();
       
    }
}