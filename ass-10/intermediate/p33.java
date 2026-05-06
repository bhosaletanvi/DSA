import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter 1st array size  : ");
		int size1 = sc.nextInt();
		int [] arr1= new int[size1];
		System.out.print("Enter array elements : ");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}
		
		System.out.print("Enter 2nd array size  : ");
		int size2 = sc.nextInt();
		int [] arr2= new int[size2];
		System.out.print("Enter array elements : ");
		for(int i=0;i<arr2.length;i++){
			arr2[i]=sc.nextInt();
		}
		int max=0;
		for(int i =0;i<arr1.length;i++){
			max=Math.max(max,arr1[i]);
		}
		for(int i =0;i<arr2.length;i++){
			max=Math.max(max,arr2[i]);
		}

		int [] freq=new int[max+1];
		for(int i =0;i<arr1.length;i++){
			freq[arr1[i]]++;
		}
		for(int i =0;i<arr2.length;i++){
			freq[arr2[i]]++;
		}
		for(int i =0;i<freq.length;i++){
			if(freq[i]!=0){
				System.out.print(" "+i);

			}
		}

	}
}