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
		boolean flag=true;
		int n=arr.length/2;
		for(int i=0;i<n; ){
			for(int j=arr.length-1;j>=n;j--){
				if(arr[i]!=arr[j]){
					flag=false;
					break;
				}
				i++;
			}
			if(!flag){
				break;
			}
			
		}
		System.out.print(flag);	
	}
}