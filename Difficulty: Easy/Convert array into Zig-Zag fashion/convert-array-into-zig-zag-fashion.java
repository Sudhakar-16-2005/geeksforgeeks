
class Solution {
    public static void zigZag(int[] arr) {
        // code here
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0) {
                if (arr[i] > arr[i + 1]) {
                    
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                   
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}

