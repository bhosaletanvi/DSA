import java.util.Scanner;
public class Pelindrome{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number : "); 
       int n =sc.nextInt();
       int original=n,reverse=0;
       while(n!=0){
        int digit=n%10;
        reverse=reverse*10+digit;
        n=n/10;
       }
       if(original==reverse){
        System.out.println("Pelindrome Number ");
       }
       else{
        System.out.println("Not Pelindrome Number ");
       }
    }
}
