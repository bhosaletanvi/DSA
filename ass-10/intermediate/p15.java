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
		int [] temp =new int[size];
		for(int i=0;i<arr.length-1;i++){
			temp[i]=arr[i+1];
		}	
		temp[arr.length-1]=arr[0];
		for(int i = 0; i<temp.length;i++){
			System.out.print(" "+temp[i]);
		}	
	}
}