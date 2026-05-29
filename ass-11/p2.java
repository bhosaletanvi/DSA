class demo{
	public static void main(String [] args){
		int [] arr={-4,-3,-2,-1,4,3,2};
		int sum=0,max=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
			max=Math.max(max,sum);
		}
		System.out.print(max);
	}
}