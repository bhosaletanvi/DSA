import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Size : ");
		int size = sc.nextInt();
		String [] arr = new String[size];
		System.out.print("Enter element : ");
		for(int i = 0; i<arr.length;i++){
			arr[i]=sc.next();
		}
		System.out.println("Enter  startIndex : ");
		int startIndex = sc.nextInt();
		System.out.print(evenMax(arr,startIndex));
	}
		
	static int evenMax(String [] words,int startIndex){
		int min=Integer.MAX_VALUE,temp=0;
		for(int i=0;i<words.length;i++){
			if(words[i]==words[startIndex]){
				int first=(i+1)%words.length;
				int last=(i-1)%words.length;
				temp= Math.min(first,last);
			}
			min=Math.min(min,temp);
		}
		return min;
	}
}