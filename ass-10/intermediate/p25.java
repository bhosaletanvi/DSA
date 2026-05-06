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
			int left_sum=0,right_sum=0;
			for(int j =0; j<i;j++){
				left_sum+=arr[j];
			}
			
			for(int j =i+1; j<arr.length;j++){
				right_sum+=arr[j];
			}
			
			if(left_sum==right_sum){
				System.out.print(" "+i);
			}
		}		
	}
}