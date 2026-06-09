import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter jewels : ");
		String jewels= sc.nextLine();

		System.out.println("Enter Stones : ");
		String stones= sc.nextLine();

		HashMap <Character , Integer> hm = new HashMap<>();
		for(int i=0;i<stones.length();i++){
			hm.put(stones.charAt(i),hm.getOrDefault(stones.charAt(i),0)+1);
		}
		int count=0;
		for(int i=0;i<jewels.length();i++){
			count+=hm.getOrDefault(jewels.charAt(i),0);
		}
		System.out.println(count);
	}
}