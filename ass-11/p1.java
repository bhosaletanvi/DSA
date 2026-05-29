class demo{
	public static void main(String [] args){
		int [] arr={3,1,2,2,2,1,3};
		int k=2;
		int count=0;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if((arr[i]==arr[j]) && ((i*j)%2==0)){
					count++;
				}
			}
		}
		System.out.print(count);
	}
}