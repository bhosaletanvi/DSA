import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		int sum =0;
		for(int i=0;i<s.length()-1;i++){
			int digit=Math.max(s.charAt(i),s.charAt(i+1))-Math.min(s.charAt(i),s.charAt(i+1));	
			sum+=digit;		
		}
		System.out.println(sum);
	}
}