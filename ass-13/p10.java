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
		int max=0,maxindex=0,product=1;
		for(int j=1;j<=3;j++){
			max=Integer.MIN_VALUE;
			for(int i=0;i<arr.length;i++){
				if(arr[i]>max){
					max=arr[i];
					maxindex=i;
				}
			}
			arr[maxindex]=Integer.MIN_VALUE;
			product*=max;
		}		
		System.out.print(product);
	}
}