class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        int[] temp = new int[arr.length];
        mergeSortHelper(arr, temp, l, r);
    }

    void mergeSortHelper(int arr[], int[] temp, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            mergeSortHelper(arr, temp, l, m);
            mergeSortHelper(arr, temp, m + 1, r);

            merge(arr, temp, l, m, r);
        }
    }

    void merge(int arr[], int[] temp, int l, int m, int r) {
        int i = l;      
        int j = m + 1; 
        int k = l;     

        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= m) {
            temp[k++] = arr[i++];
        }

        while (j <= r) {
            temp[k++] = arr[j++];
        }

        for (int p = l; p <= r; p++) {
            arr[p] = temp[p];
        }
    }
}
