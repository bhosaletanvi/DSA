import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		StringBuilder ans = new StringBuilder();
		String[] words = s.split(" ");
		for(int i=0;i<words.length;i++){
			String temp=words[i];
			for(int j=temp.length()-1;j>=0;j--){
				ans.append(temp.charAt(j));
			}
			ans.append(" ");
		}
	
		System.out.print(ans);		
	}
}