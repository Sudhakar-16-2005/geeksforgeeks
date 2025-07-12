class Solution {
     public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
         int row = mat.length;
        int col = mat[0].length;
        
        ArrayList<ArrayList<Integer>>trans = new ArrayList<>();
        
        for(int i = 0; i < col;i++){
            ArrayList<Integer>r = new ArrayList<>();
            for(int j = 0; j < row; j++){
                r.add(mat[j][i]);
            }
            trans.add(r);
        }
        return trans;
    }
}