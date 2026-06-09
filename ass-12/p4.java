import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		int max=0;
		String [] sentence = s.split(" ");
		for(int i=0;i<sentence.length;i++){
			String temp = sentence[i];
			String [] str = temp.split(" ");
			int count=str.length-1;
			max=Math.max(count,max);
		}			
		System.out.println(max);
	}
}