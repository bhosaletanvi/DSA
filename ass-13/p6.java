import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Array Size : ");
		int size1 = sc.nextInt();
		int [] arr1 = new int[size1];
		System.out.print("Enter 1st array elements : ");
		for(int i = 0; i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}
		

		System.out.println("Enter 2nd Array Size : ");
		int size2 = sc.nextInt();
		int [] arr2 = new int[size2];
		System.out.print("Enter 2nd array elements : ");
		for(int i = 0; i<arr2.length;i++){
			arr2[i]=sc.nextInt();
		}

		int index=0;
		int temp[] = new int [arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++){
			temp[index]=arr1[i];
			index++;
		} 
		for(int i=0;i<arr2.length;i++){
			temp[index]=arr2[i];
			index++;
		}
		if(temp.length%2==0){
			System.out.println((float)(temp[temp.length/2]+temp[temp.length/2-1])/2);
		} else{
			System.out.println(temp[temp.length/2]);
		}

	}
}