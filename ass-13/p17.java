import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pattern : ");
		String pattern = sc.next();
		sc.nextLine();
		System.out.println("Enter String  : ");
		String s = sc.nextLine();

		System.out.println(pattern(pattern,s));
		
	}
	
	static boolean pattern(String pattern,String s2){
		String [] s= s2.split(" ");
		HashMap<Character, String> hm = new HashMap<>();
		for(int i=0;i<pattern.length();i++){
			if(!hm.containsKey(pattern.charAt(i))){
				hm.put(pattern.charAt(i),s[i]);
			}else{
				if(!hm.get(pattern.charAt(i)).equals(s[i])){
					return false;
				}
			}
		}
	return true;
		
	}
}