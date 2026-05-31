class demo{
	public static void main(String [] args){
		int [] arr={1,5,2,4,1};
		int diff=0,count=0;
		boolean flag=false;
		while(!flag){
			flag=true;
			for(int i=arr.length-1;i>0;i--){
				diff=0;
				if(arr[i]<=arr[i-1]){
					diff=arr[i-1]-arr[i];
					count=count+diff+1;
					arr[i]+=diff+1;
					flag=false;
				}
			}
		}
		System.out.print(count);
	}
}