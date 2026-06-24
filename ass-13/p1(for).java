import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		
		System.out.println("Enter elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int maxindex=0;
		int max=Integer.MIN_VALUE;
		for(int j=1;j<=3;j++){
			max=Integer.MIN_VALUE;
			for(int i=0;i<arr.length;i++){
				if(arr[i]>max){
					maxindex=i;
					max=arr[i];
				}	
			}
			if(arr.length==2){
				break;
			}
			arr[maxindex]=Integer.MIN_VALUE;
		}
		System.out.print(max);
	}
}