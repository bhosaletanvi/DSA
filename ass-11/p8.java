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

		int count=0;
		for(int i=0;i<arr.length-2;i++){
			if(arr[i]==0){
				count++;
				for(int j=i;j<=i+2;j++){
					if(arr[j]==0){
						arr[j]=1;
					}else{
						arr[j]=0;
					}
				}
			}					
		}

		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				count=-1;
				break;
			}
		}
		
		System.out.println(count);

	}
}