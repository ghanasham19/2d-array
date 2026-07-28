class Solution {
    public void rotate(int[][] arr) {
        int narr[][]=new int[arr.length][arr[0].length];
        int n=0;
        for(int i=0;i<arr.length;i++){
            int p=arr.length-1;
            for(int j=0;j<arr[0].length;j++){
                narr[i][j]=arr[p][n];
                p--;
            }
            n++;
        }
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=narr[i][j];
            }
            
        }

    }
}