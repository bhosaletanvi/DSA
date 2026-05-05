import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.print("Enter array element : ");
		for(int i = 0; i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int j=arr.length-1;
		for(int i =0;i<arr.length;i++){
			if(i>=j){
				break;
			}
			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];
			j--;
		}
		
		for(int i = 0; i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}