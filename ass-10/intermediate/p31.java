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
			for(int j=0;j<arr.length;j++){
				for(int k =0;k<arr.length;k++){
					if(arr[i]+arr[j]+arr[k]==0){
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					} 
				}
			}
		}	
	}
}