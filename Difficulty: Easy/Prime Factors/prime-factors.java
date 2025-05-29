

class Solution {
    public int[] AllPrimeFactors(int N) {
        // code here
         List<Integer> res = new ArrayList<>();
        if (N % 2 == 0) {
            res.add(2);
            while (N % 2 == 0) {
                N /= 2;
            }
        }
        for (int i = 3; i * i <= N; i += 2) {
            if (N % i == 0) {
                res.add(i);
                while (N % i == 0) {
                    N /= i;
                }
            }
        }
        if (N > 2) {
            res.add(N);
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;
    }
}