class Demo{
	public static void main(String[]args){
		int[] [] arr={{1,2,3,4},{5,6,7,8},{9,5,6,7},{7,2,8,12}};
		int n=0;
	        int len=arr[0].length-1;
		for(int i=0;i<=arr.length;i++){
			for(int j=0;j<=len;j++){

				if(i==arr.length-1){	
					System.out.print(arr[i][n]+" ");
						if(j!=len)n--;
						continue;
				}
				if(i==0){	
					System.out.print(arr[i][n]+" ");
						if(j!=len)n++;
						continue;
				}
				if(i>0 && i<arr.length)	{
				System.out.print(arr[i][n]+" ");
				break;
				}



			}
		}
		int s=arr.length-2;
		while(s>0){
		System.out.print(arr[s][n]+" ");	
		s--;		
		}
	}

}

:)