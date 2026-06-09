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

		System.out.print("Enter Capacity : ");
		int original_capacity = sc.nextInt();
		int capacity=original_capacity,steps=0;
		for(int i=0;i<arr.length;i++){
			if(capacity>=arr[i]){
				steps++;
				capacity-=arr[i];
			}else{
				steps+=i;
				capacity=original_capacity;
				steps+=(i+1);
				capacity-=arr[i];
			}
		}
		System.out.println(steps);

	}
}