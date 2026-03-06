import java.util.Scanner;
public class ReverseNumber{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number : "); 
       int n =sc.nextInt();
       int reverse=0;
       while(n!=0){
        int digit=n%10;
        reverse=reverse*10+digit;
        n=n/10;
       }
       System.out.println("Reverse Number : "+reverse);
    }
}

// --------------------- DRY RUN ------------------------------
//   n=321
// reverse =0
//   while (n!=0) (321 !=0) -> true
//     digit = n%10 (321 %10 ) ->  1
//     reverse=reverse*10+digit (0*10 +1 ) -> 1
//     n=n/10 (321/10) ->32

//  while (n!=0) (32 !=0) -> true
//     digit = n%10 (32 %10 ) ->  2
//     reverse=reverse*10+digit (1*10 +2 ) -> 12
//     n=n/10 (32/10) ->3

//  while (n!=0) (3 !=0) -> true
//     digit = n%10 (3 %10 ) ->  3
//     reverse=reverse*10+digit (12*10 +3 ) -> 3
//     n=n/10 (3/10) ->0

//  while (n!=0) (0!=0) -> False 
//         print 54321
// --------------- End while loop -------------------------------
  

//   o/p :

// Enter Number : 12345
// Reverse Number : 54321
  
  
