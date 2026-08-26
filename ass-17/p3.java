import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.next();
		System.out.println(ans(s));

	}


	static int ans(String s){
		Stack<Character> st = new Stack<>();
		int count=0;
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);

			if(ch=='(' || ch =='+' || ch=='-' || ch =='/' || ch=='*'){
				st.push(ch);
			}else if(ch==')'){
				boolean flag = false;
				while(!st.isEmpty() && st.peek()!='('){
					st.pop();
					flag=true;
				}

				if(st.peek()=='(' && ch==')' && flag){
					count++;
				}
				st.pop();
			}
		}
		return count;
	}
}