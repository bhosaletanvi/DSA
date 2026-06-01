class demo{
	public static void main(String [] args){
		int [] arr={9,12,5,10,14,3,10};
		int pivot=10,left=0;
		int mid=arr.length/2,right=mid+1;
		int [] temp= new int[arr.length];
		temp[mid]=pivot;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==pivot){
				arr[i]=0;
				break;
			}
		}
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]==0){
				i++;
			}else if(arr[i]<pivot){
				System.out.println(arr[i]+" "+left);
				temp[left]=arr[i];
				left++;
			}else if(arr[i]>pivot ){
				System.out.println(arr[i]+" "+right);	
				temp[right]=arr[i];
				right++;
			}
		}

		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]+" ");			
		}

	}
}