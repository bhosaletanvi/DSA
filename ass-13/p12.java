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
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				if(arr[j]==arr[i]*2){
					al.add(arr[i]);

				}
			}
		}			
		System.out.println(al);
	}
}