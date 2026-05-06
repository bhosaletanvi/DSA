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
		System.out.print("Enter target : ");
		int target = sc.nextInt();

		int [] ans=new int [2];
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){
				ans[0]=i;
				break;
			}
		}

		for(int i=arr.length-1;i>=0;i--){
			if(arr[i]==target){
				ans[1]=i;
				break;
			}
		}
		
		for(int i=0;i<ans.length;i++){
			System.out.print(" "+ans[i]);

		}

	}

}