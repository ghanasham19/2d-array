//1386. Cinema Seat Allocation
class Solution {
    public int maxNumberOfFamilies(int n, int[][] arr) {
                int oarr[][]=new int[n][10];
                for(int i=0;i<arr.length;i++){
                    int a=arr[i][0]-1;
                    int b=arr[i][1]-1;
                    oarr[a][b]=1;
                }
                int count=0;
                for(int i=0;i<oarr.length;i++){
                    for(int j=0;j<oarr[i].length;j++){
                        if(j==1||j==3||j==5){
                                boolean w=true;
                                int a=1;
                                while(a<=4){
                                        if(oarr[i][j]!=0){
                                            w=false;
                                            break;
                                        }
                                       if(a<4) j++;
                                       a++;
                                } 
                                if(w){
                                    count++;
                                }  
                        }
                    }
                }
                return count;
                
    }
}