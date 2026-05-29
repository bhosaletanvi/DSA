class demo{
	public static void main(String [] args){
		int [][] arr={
			{5}		
		};
		int sum=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(i==j || (i+j==arr.length-1)){
					sum+=arr[i][j];

				}
			}
		}
		System.out.print(sum);
	}
}