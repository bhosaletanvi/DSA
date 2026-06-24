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
		System.out.println("Enter k : ");
		int k = sc.nextInt();
		HashMap <Integer,Integer> hm = new HashMap<>();
		int sum=0;
		int count=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
			if(hm.containsKey(sum-k)){
				count+=hm.get(sum-k);
			}
			hm.put(sum,hm.getOrDefault(sum,0)+1);
		}
		System.out.print(count);

	}
}