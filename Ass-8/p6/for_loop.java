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
        int max=0;
        char ans='A';
        for(int i=0;i<str.length();i++){
            int count=0;
                for (int j = 0; j < str.length(); j++) {
                    if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count>max){
                max=count;
                ans=str.charAt(i);

            }
        }
        System.out.print(ans);
    }

}