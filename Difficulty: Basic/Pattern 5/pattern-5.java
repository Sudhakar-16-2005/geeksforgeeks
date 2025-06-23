class Solution {

    void printTriangle(int n) {
        // code here
        for (int row=n;row>=1;row--){
            for(int col=row;col>=1;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}