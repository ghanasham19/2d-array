class Demo{
	public static void main(String[]args){
		int[] [] arr={{1,2,3,4},{5,6,7,8},{9,5,6,7},{7,2,8,12}};
		int r=1;
		int c=2;		
		int i=r;
		int j=c;
		int a=0;
		int b=1;
		System.out.print(arr[i][j]);
		while(i<=arr.length || j<=arr[0].length){
			if(a==0){
				for(int k=1;k<=b;k++){
				System.out.print(arr[i][j+k]);
				}
			
			j+=b;
			a++;	
			}
			else if(a==1){
				if(i<arr.length && j<arr[0].length && i>=0 && j>=0){
				for(int k=1;k<=b;k++){
				System.out.print(arr[i+k][j]);
				}
				}
			i+=b;
			a++;
			}
			else if(a==2){
				if(i<arr.length && j<arr[0].length && i>=0 && j>=0){
				for(int k=1;k<=b;k++){
				System.out.print(arr[i][j-k]);
				}
			}
			j-=b;
			a++;
			}
			else if(a==3){
				if(i<arr.length && j<arr[0].length && i>=0 && j>=0){
				for(int k=1;k<=b;k++){
				System.out.print(arr[i-k][j]);
				}
			}
			i-=b;
			a=0;
			}
			
		if(a==2 || a==0)b++;
		}
	       
	}

}

