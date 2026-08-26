import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.next();
		System.out.println(ans(s));

	}


	static StringBuilder ans(String s){
		boolean flag=false;
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++){
			char ch =s.charAt(i);
			if(!st.isEmpty() && ch=='(' && st.peek()=='-'){
				flag=true;
			}
			if(ch!='(' && ch!=')'){
				if(ch!='+' && ch!='-'){
					st.push(ch);
				}
				if(ch=='+' && flag){
					st.push('-');
				}else if(ch=='+' && !flag){
					st.push(ch);
				}
				if(ch=='-' && flag){
					st.push('+');
				}else if(ch=='-' && !flag){
					st.push(ch);
				}
			}
			if(ch==')' || (ch=='(' && st.peek()=='+')){
				flag=false;
			}
		}
		StringBuilder sb = new StringBuilder();
		while(!st.isEmpty()){
			sb.append(st.pop());
		}
		return sb.reverse();
	}
}