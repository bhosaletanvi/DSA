// Q11. Check If Two Strings Are Anagrams
// Same characters with same frequency
// Example:
// String str1 = "heart" , String str2 = "earth"
// → Output: true
import java.util.HashMap;
import java.util.Scanner;
class demo{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter 1st String :");
        String str1 =sc.nextLine();
        System.out.print("Enter 2nd String :");
        String str2 =sc.nextLine();
        HashMap <Character,Integer> hm1 = new HashMap<>();
        for(int i=0;i<str1.length();i++){
            hm1.put(str1.charAt(i),hm1.getOrDefault(str1.charAt(i), 0)+1);
        }
        HashMap <Character,Integer> hm2 = new HashMap<>();
        for(int i=0;i<str2.length();i++){
            hm2.put(str2.charAt(i),hm2.getOrDefault(str2.charAt(i), 0)+1);
        }
        boolean flag=true;
        for(Character key : hm1.keySet()){
            if(hm2.containsKey(key)==false){
                flag=false;
                break;
            }
        }
        System.out.print(flag);
    }

}
