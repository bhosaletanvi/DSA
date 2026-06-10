import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  Size : ");
		int size = sc.nextInt();
		sc.nextLine();

		String [] s= new String[size];
		System.out.print("Enter String : ");
		for(int i=0;i<s.length;i++){
			s[i] = sc.nextLine();
		}
		
		ArrayList<Character> ans = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		boolean flag=true;
		int index=1;
		for(int i=0;i<s[0].length();i++){
			while(index<s.length){
				sb.append(s[index]);
				if(flag){
					flag=false;
					for(int j=0;j<sb.length();j++){
						if(s[0].charAt(i)==sb.charAt(j)){
							sb.deleteCharAt(j);
							flag=true;
							break;
						}
					}
				}
				s[index]=sb.toString();
				index++;
				sb.setLength(0);
			}
			if(flag){
				ans.add(s[0].charAt(i));
			}
			index=1;
			flag=true;
		}

		for(int i=0;i<ans.size();i++){
			System.out.print(ans.get(i)+" ");
		}
	}
}