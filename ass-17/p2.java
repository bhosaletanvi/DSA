import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.next();
		System.out.println(ans(s));

	}


	static boolean ans(String s){
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++){
			char ch =s.charAt(i);
			boolean flag=false;
			if(!st.isEmpty()){
				if(st.peek()=='{' && (ch=='{' || ch=='[' || ch=='(')){
					st.push(ch);
					flag=true;
				}else if(st.peek()=='[' && (ch=='[' || ch=='(')){
					st.push(ch);
					flag=true;
				}else if(st.peek()=='(' && ch=='('){
					st.push(ch);
					flag=true;
				}
			}else{
				if(ch=='{' || ch=='[' || ch=='('){
					st.push(ch);
					flag=true;

				}
			}
			if(!flag){
			if(ch==')' && st.peek()=='('){
				st.pop();
			}else if(ch=='}' && st.peek()=='{'){
				st.pop();
			}else if(ch==']' && st.peek()=='['){
				st.pop();
			}else{
				return false;
			}
			}
		}
		return st.isEmpty();
	}
}