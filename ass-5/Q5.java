import java.util.Scanner;
public class SUmofNo {
        public static void main(String[] args) {
        int sum=0;    
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number : "); 
       int n =sc.nextInt();
       while(n!=0){
        int digit=n%10;
        n=n/10;
        sum=sum+digit;
       }
       System.out.println("Sum of digits  : "+sum);
    }
}
    


// --------------------- DRY RUN ------------------------------
//   sum =0 
//   n=321
//   while (n!=0) (321 !=0) -> true
//     digit = n%10 (321 %10 ) ->  1
//     n=n/10 (321/10) ->32
//     sum=sum+ digit -> 0+1 -> 1

//  while (n!=0) (32 !=0) -> true
//     digit = n%10 (32 %10 ) ->  2
//     n=n/10 (32/10) ->3
//    sum =sum +digit -> 1+2=3 

//  while (n!=0) (3 !=0) -> true
//     digit = n%10 (3%10 ) ->  3
//     n=n/10 (3/10) ->0
//    sum =sum +digit -> 3+3=6 

//  while (n!=0) (0!=0) -> False 
//  print sum -> 6 
// --------------- End while loop -------------------------------
  
//   print Count -> 3

//   o/p :

// Enter Number : 543
// Sum of digits  : 12
  
  
