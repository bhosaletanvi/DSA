import java.util.Scanner;
public class perfect_no {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n= sc.nextInt();
        int sum=0;
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                // System.out.println(" "+i);
                sum=sum+i;
            }
           
        }
        if(sum==n){
            System.out.println("Perfect Number ");
        }
        else{
            System.out.println("not Perfect Number ");
        }
    }
}

// ---------------------- DRY RUN -----------------------
//   n=6
//   sum=0
//   i=1 i<=n (1<6) -> true
//    if(n%i==0) (6%1==0) -> true
//       sum=sum+i -> 0+1 -> 1
//    i++ (i=2)

//   i=2 i<=n (2<6) -> true
//    if(n%i==0) (6%2==0) -> true
//       sum=sum+i -> 1+2 -> 3
//    i++ (i=3)

//   i=3 i<=n (3<6) -> true
//    if(n%i==0) (6%3==0) -> true
//       sum=sum+i -> 3+3 -> 6
//    i++ (i=4)

//   i=4 i<=n (4<6) -> true
//    if(n%i==0) (4%3==0) -> false
//    i++ (i=5)

//     i=5 i<=n (5<6) -> true
//    if(n%i==0) (5%3==0) -> false
//    i++ (i=6)

//  i=6 i<=n (6<6) -> false
//  ------------------ end for loop ----------------------
//   if(sum==n)
//     (6==6) -> true
//        perfect Number 


//   o/p :

// Enter Number : 6
// Perfect Number

// Enter Number : 28
// Perfect Number

// Enter Number : 4
// not Perfect Number  
  
