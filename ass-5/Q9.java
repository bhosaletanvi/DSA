// import java.util.Scanner;
// public class primeNo {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter Number : ");
//         int n= sc.nextInt();
//         int value=0;
//         for (int i = 2; i <=n; i++) {
//             if(n%i==0){
//                 value=i;
//                 break;
//             }

//         }
//         if(value==n){
//             System.out.println("Prime Number ");
//         }
//         else{
//             System.out.println("Not Prime Number ");
//         }
//     }
// }

// ----------------------- DRY RUN -----------------------------
//   n=3
//   value=0
//   i=2 i<=n (2<=3) 
//    if(n%i==0) (3%2==0) -> false 
//    i++ (i=3)

//   i=3 i<=n (3<=3) 
//    if(n%i==0) (3%3==0) -> true
//       value=i -> 3
//       break 
// ------------------ end for loop -------------------------------
//  if(value==n)
//    (3==3)
//      prime Number 
// o/p : 
// Enter Number : 3
// Prime Number

// Enter Number : 4
// Not Prime Number

// Enter Number : 7
// Prime Number

  
    
