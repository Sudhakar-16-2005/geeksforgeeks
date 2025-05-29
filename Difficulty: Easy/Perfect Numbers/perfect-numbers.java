// User function Template for Java

class Solution {
    static boolean isPerfectNumber(int n) {
        // code here
       if (n <= 1) return false;

        int sum = 1; 
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                sum += i;
                int otherDivisor = n / i;
                if (otherDivisor != i) {
                    sum += otherDivisor;
                }
            }
        }

        return sum == n;
    }
};
