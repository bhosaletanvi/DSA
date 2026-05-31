class demo{
	public static void main(String [] args){
		int [][] arr={
				{3,7,8},
				{9,11,13},
				{15,16,17}
		};
		boolean flag=true;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				for(int k=0;k<arr.length;k++){
					if(arr[i][j]<arr[k][j]){
						flag=false;
						break;
					}
				}
				if(flag){
					for(int k=0;k<arr[0].length;k++){
						if(arr[i][j]>arr[i][k]){
							flag=false;
							break;
						}
					}
				}

				if(flag){
					System.out.print(arr[i][j]+" ");
				}
				flag=true;
			}
		}
	}
}