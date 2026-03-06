import java.util.Scanner;
public class extractDigits {
        public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number : "); 
       int n =sc.nextInt();
       while(n!=0){
        int digit=n%10;
        n=n/10;
         System.out.println(digit);
       }
    }
}
    

// --------------------- DRY RUN ------------------------------
//   n=321
//   while (n!=0) (321 !=0) -> true
//     digit = n%10 (321 %10 ) ->  1
//     n=n/10 (321/10) ->32
       // print digit -> 1
//  while (n!=0) (32 !=0) -> true
//     digit = n%10 (32 %10 ) ->  2
//     n=n/10 (32/10) ->3
       // print digit -> 2

//  while (n!=0) (1 !=0) -> true
//     digit = n%10 (3%10 ) ->  3
//     n=n/10 (3/10) ->0
       // print digit -> 3

//  while (n!=0) (0!=0) -> False 
  
// --------------- End while loop -------------------------------
  

//   o/p :

// Enter Number : 5382
// 2
// 8
// 3
// 5
  
  
