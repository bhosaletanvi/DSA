// Q6. Most Frequent Character in String
// Return most frequent character in the string
// Example:
// String str = "apple"
// → Output: 'p'
import java.util.Scanner;
class demo{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter 1st String :");
        String str1 =sc.nextLine();
        System.out.print("Enter 2nd String :");
        String str2 =sc.nextLine();
        int [] freq1=new int [26];
        for(int i=0;i<str1.length();i++){
            freq1[str1.charAt(i)-'a']++;
        }
        int [] freq2=new int [26];
        for(int i=0;i<str2.length();i++){
            freq2[str2.charAt(i)-'a']++;
        }
        
        for(int i=0;i<freq1.length;i++){
            if(freq1[i]==freq2[i]){
                
            }

        }
        System.out.print((char)(ans+'a'));
    }

}

