class Solution {
    static String getBinaryRep(int n) {
        // code here
   return String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
    }
}