import java.util.Scanner;
public class Count_no {
        public static void main(String[] args) {
        int count=0;    
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number : "); 
       int n =sc.nextInt();
       while(n!=0){
        int digit=n%10;
        n=n/10;
        count++;
       }
       System.out.println("Total Digits in Number : "+count);
    }
}
    

// --------------------- DRY RUN ------------------------------
//   count =0 
//   n=321
//   while (n!=0) (321 !=0) -> true
//     digit = n%10 (321 %10 ) ->  1
//     n=n/10 (321/10) ->32
//     count ++ (0+1) -> 1

//  while (n!=0) (32 !=0) -> true
//     digit = n%10 (32 %10 ) ->  2
//     n=n/10 (32/10) ->3
//     count ++ (1+1) -> 2  

//  while (n!=0) (1 !=0) -> true
//     digit = n%10 (3%10 ) ->  3
//     n=n/10 (3/10) ->0
//     count ++ (2+1) -> 3

//  while (n!=0) (0!=0) -> False 
  
// --------------- End while loop -------------------------------
  
//   print Count -> 3

//   o/p :

// Enter Number : 54321
// Total Digits in Number : 5

  
  
