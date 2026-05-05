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
		boolean flag= false;
		System.out.print("Enter target : ");
		int target = sc.nextInt();

		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;++j){
				if(arr[i]+arr[j]==target){
					System.out.print(i+" "+j);
					flag=true;	
					break; 
				}
			}
			if(flag){
				break;
			}
		}		
	}
}