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

// --------------------- DRY RUN ------------------------------
//   n=121
// original =n -> 121
// reverse =0
//   while (n!=0) (121 !=0) -> true
//     digit = n%10 (121 %10 ) ->  1
//     reverse=reverse*10+digit (0*10 +1 ) -> 1
//     n=n/10 (121/10) ->12

//  while (n!=0) (12 !=0) -> true
//     digit = n%10 (12 %10 ) ->  2
//     reverse=reverse*10+digit (1*10 +2 ) -> 12
//     n=n/10 (12/10) ->1

//  while (n!=0) (1 !=0) -> true
//     digit = n%10 (1 %10 ) ->  1
//     reverse=reverse*10+digit (12*10 +1 ) -> 121
//     n=n/10 (1/10) ->0

//  while (n!=0) (0!=0) -> False 

// if(oroginal== reverse)
//     121 == 121 -> true
//         print Pelindrome Number
// --------------- End while loop -------------------------------
  

//   o/p :

// Enter Number : 121
// Pelindrome Number

// Enter Number : 321
// Not Pelindrome Number
  
  
