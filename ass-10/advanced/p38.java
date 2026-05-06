import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size = sc.nextInt();
		
		int [] arr= new int[size];
		System.out.print("Enter array elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			int left=i-1,right=i+1;
			if(i==0){
				left=right;
			}
			else if (i==arr.length-1){
				right=left;
			}
			
			if(arr[left]<arr[i] && arr[right]<arr[i]){
				System.out.print(" "+i);
			}
		}			
	}
}