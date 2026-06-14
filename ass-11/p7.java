class demo{
	public static void main(String [] args){
		int [] arr={9,15,12,-14,8,-7,-11};
		int pivot=-7;
		int [] temp= new int[arr.length];
		int index=0,count=0;
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]<pivot){
				temp[index]=arr[i];
				index++;
			}
		}
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]==pivot){
				temp[index]=arr[i];
				index++;
			}
		}
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]>pivot && arr[i]!=0){
				temp[index]=arr[i];
				index++;
			}
		}

		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]+" ");			
		}

	}
}