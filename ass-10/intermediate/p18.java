import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int size = sc.nextInt();
		System.out.print("Enter K : ");
		int k = sc.nextInt();
		int [] arr = new int[size];
		System.out.print("Enter array element : ");
		for(int i = 0; i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		int [] temp = new int[size];
		for(int i =1;i<=k;i++){
			temp[k+i]=arr[i-1];
		}				
		for(int i=k;i<arr.length;i++){
			temp[i-k]=arr[i];
		}
		for(int i = 0; i<temp.length;i++){
			System.out.print(" "+temp[i]);
		}

	}
}