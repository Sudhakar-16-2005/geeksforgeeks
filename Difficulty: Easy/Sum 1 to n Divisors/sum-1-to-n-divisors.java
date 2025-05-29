class Solution {
    public static long sumOfDivisors(long n) {
    int totalSum = 0;
        for (int i = 1; i <= n; i++) {
            totalSum += i * (n / i);
        }
        return totalSum;
    }
}
