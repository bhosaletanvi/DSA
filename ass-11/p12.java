import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int size = sc.nextInt();
		int [] arr= new int[size];
		System.out.print("Enter Elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		boolean flag=false;
		int leftsum=0,rightsum=0,leftindex=0,rightindex=0,index=-1;
		for(int i=0;i<arr.length;i++){
			leftsum=0;
			rightsum=0;
			leftindex=i-1;
			rightindex=i+1;
			while(leftindex>=0){
				leftsum+=arr[leftindex];
				leftindex--;
			}

			while(rightindex<arr.length){
				rightsum+=arr[rightindex];
				rightindex++;
			}	
			if(leftsum==rightsum){
				index=i;
				break;
			}		
		}
		System.out.println(index);

	}
}