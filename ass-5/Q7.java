import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n= sc.nextInt();
        for (int i = 1; i < Math.sqrt(n); i++) {
            if(n%i==0){
                System.out.println(i);
            }
            if(i!=n/i){
                System.out.print(" "+n/i);
            }
        }
    }
}


// -------------------- DRY RUN ------------------------
//   n=12
//   i=1 i<=sqrt(12) (1<=3) 
//    if(n%i==0) -> (12%1==0) -> true
//       print i -> 1
//    if(i!=n/i) -> (1!=12/1) -> true
//       print n/i -> 12/1 -> 12
//   i++ (i=2)

//    i=2 i<=sqrt(12) (2<=3) 
//    if(n%i==0) -> (12%2==0) -> true
//       print i -> 2
//    if(i!=n/i) -> (2!=12/2) -> true
//       print n/i -> 12/2 -> 6
//   i++ (i=3)

//    i=3 i<=sqrt(12) (3<=3) 
//    if(n%i==0) -> (12%3==0) -> true
//       print i -> 3
//    if(i!=n/i) -> (2!=12/3) -> true
//       print n/i -> 12/3 -> 4
//   i++ (i=4) 

//   i=4 i<=sqrt(12) (4<=3) -> false
// --------------End for loop -----------------

//     o/p : 
    
// Enter Number : 12
// 1
// 12
// 2
// 6
// 3
// 4
  
