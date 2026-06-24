import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1 : ");
		String s1 = sc.next();
		
		System.out.println("Enter String 2 : ");
		String s2 = sc.next();
		System.out.println(checkString(s1,s2));
		
	}
	static boolean checkString(String s1,String s2){
		if(s1.length()!=s2.length()){
			return false;
		}
		if(s1.equals(s2)){
			return true;
		}
		int index=0;
		for(int i=s2.length()-1;i>=0;i--){
			if(s1.charAt(index)!=s2.charAt(i)){
				if(s1.charAt(i)!=s2.charAt(i)){
					return false;
				}
			} 
			index++;
		}
		return true;
	}
}