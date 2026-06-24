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
		int index=0;
		StringBuilder sb1 = new StringBuilder(s1);
		StringBuilder sb2 = new StringBuilder(s2);
		int [] arr= new int[2];
		for(int i=0;i<sb1.length();i++){
			if(sb1.charAt(i)!=sb2.charAt(i)){
				arr[index]=i;
				index++;
			}
			if(index==arr.length){
				break;
			}
		}
		char temp = sb1.charAt(arr[0]);
    		sb1.setCharAt(arr[0], sb1.charAt(arr[1]));
    		sb1.setCharAt(arr[1], temp);

		return sb1.toString().equals(sb2.toString());
	}
}