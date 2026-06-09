import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size : ");
		int size= sc.nextInt();
		String [] sentence = new String[size];
		for(int i=0;i<sentence.length;i++){
		System.out.println("Enter sentence "+(i+1)+" : ");

			sentence[i]=sc.nextLine();
			sc.nextLine();
		}
		int max=0;
		for(int i=0;i<sentence.length;i++){
			String temp = sentence[i];
			String [] str = temp.split(" ");
			int count=str.length;
			max=Math.max(count,max);
		}			
		System.out.println(max);
	}
}