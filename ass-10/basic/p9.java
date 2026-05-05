import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		
		System.out.print("Enter array element : ");
		for(int i = 0; i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int max =0;
		for(int i = 0; i<arr.length;i++){
			max=Math.max(max,arr[i]);
		}
	
		int [] freq=new int [max+1];
		for(int i = 0; i<arr.length;i++){
			freq[arr[i]]++;
		}
		for(int i = 0; i<freq.length;i++){
			if(freq[i]!=0){
				System.out.println(i+" : "+freq[i]);
			}
		}
		
	}
	
}