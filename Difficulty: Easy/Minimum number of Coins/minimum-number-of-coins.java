// User function Template for Java

class Solution {
    static List<Integer> minPartition(int N) {
        // code here
        int []coins={2000,500,200,100,50,20,10,5,2,1};
        List<Integer> result = new ArrayList<>();
              for (int i = 0; i < coins.length; i++) {
            int coin = coins[i];
            int count = N / coin; 
            for (int j = 0; j < count; j++) {
                result.add(coin);
            }
            N = N % coin;
        }

        return result;
    }
}
