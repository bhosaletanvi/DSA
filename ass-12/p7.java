import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		System.out.print(all_characters(s));
	}
	static boolean all_characters(String s){
		if(s.length()<26){
			return false;
		}	
		int add=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>=97 && s.charAt(i)<=122){
				add+=(int)s.charAt(i);	
			}
			
		}
		if(add>=219){
			return true;	
		}
		return false;	
	}
}