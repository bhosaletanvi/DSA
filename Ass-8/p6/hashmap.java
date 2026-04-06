// Q6. Most Frequent Character in String
// Return most frequent character in the string
// Example:
// String str = "apple"
// → Output: 'p'
import java.util.HashMap;
import java.util.Scanner;
class demo{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter String :");
        String str =sc.nextLine();
        HashMap <Character,Integer> hm = new HashMap<>();
        for(int i=0;i<str.length();i++){
            hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i), 0)+1);
        }
        int max=0;
        char ans='A';
        for(Character key : hm.keySet()){
            if(hm.get(key)>max){
                max=hm.get(key);
                ans=key;
            }
        }
        System.out.print(ans);
    }

}
