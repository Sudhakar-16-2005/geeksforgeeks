
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
         int s=0;
        boolean subset=false;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<b.length;i++){
            subset=false;
            for(int j=s;j<a.length;j++){
            if(b[i]==a[j]){
                subset=true;
                s++;
                break;
            }
            }
            if(subset==false){
                return false;
            }
        }
        return true;
    } 
}

