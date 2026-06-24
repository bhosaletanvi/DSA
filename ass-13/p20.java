import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1 : ");
		String s1 = sc.next();
		
		System.out.println("Enter String 2 : ");
		String s2 = sc.next();
		HashSet<Character> hs1= new HashSet<>();
		HashSet<Character> hs2= new HashSet<>();
		for(int i=0;i<s1.length();i++){
			hs1.add(s1.charAt(i));
		}		
		for(int i=0;i<s2.length();i++){
			hs2.add(s2.charAt(i));
		}
		for(Character ch : hs1){
			if(!hs2.contains(ch)){
				hs1.remove(ch);
			}
		}
		System.out.print(hs1);
	}
}