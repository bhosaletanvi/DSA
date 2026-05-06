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
		int max1=0;
		for(int i =0;i<arr1.length;i++){
			max1=Math.max(max1,arr1[i]);
		}
		int [] freq1=new int[max1+1];
		for(int i =0;i<arr1.length;i++){
			freq1[arr1[i]]++;
		}
		
		int max2=0;
		for(int i =0;i<arr2.length;i++){
			max2=Math.max(max2,arr2[i]);
		}
		int [] freq2=new int[max2+1];
		for(int i =0;i<arr2.length;i++){
			freq2[arr2[i]]++;
		}
		int count=0;
		int min=Math.min(freq1.length,freq2.length);
		for(int i=0;i<min;i++){
			if(freq1[i]==freq2[i]){
				count+=freq1[i];
			}
		}
		int [] ans= new int[count];
			for(int k = 0;k<ans.length;k++){
				for(int i=0;i<min;i++){
					if(freq1[i]==freq2[i]){
						for(int j=0;j<freq1[i];j++){
							ans[k]=i;
						}
					}
				}

			}

		for(int i =0;i<ans.length;i++){
			System.out.print(" "+ans[i]);

		}
		
	}
}