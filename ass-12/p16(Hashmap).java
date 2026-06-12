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

		HashMap <Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
		}
		int index=0;
		for(Integer key : hm.keySet()){
			if(key%2==0){
				int count=1;
				while(count<=hm.get(key)){
					arr[index]=key;
					index++;
					count++;	
				}
			}
		}

		for(Integer key : hm.keySet()){
			if(key%2!=0){
				int count=1;
				while(count<=hm.get(key)){
					arr[index]=key;
					index++;
					count++;	
				}
			}
		}

		for(int i = 0; i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}
}