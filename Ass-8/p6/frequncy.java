// Q6. Most Frequent Character in String
// Return most frequent character in the string
// Example:
// String str = "apple"
// → Output: 'p'
import java.util.Scanner;
class demo{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter String :");
        String str =sc.nextLine();
        int [] freq=new int [26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        int max =0,ans=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>max){
                max=freq[i];
                ans=i;
            }

        }
        System.out.print((char)(ans+'a'));
    }

}
