import java.util.Scanner;
public class Count_divisors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number : ");
        int count=0;
        int n= sc.nextInt();
        for (int i = 1; i < Math.sqrt(n); i++) {
            if(n%i==0){
                // System.out.print(" "+i);
                count++;
            }
            if(i!=n/i){
                // System.out.print(" "+(n/i));
                count++;
            }

        }
        System.out.println(count);
    }
}

// -------------------- DRY RUN ------------------------
//   n=12
//   i=1 i<=sqrt(12) (1<=3) 
//    if(n%i==0) -> (12%1==0) -> true
//       count ++ -> 1
//    if(i!=n/i) -> (1!=12/1) -> true
//       count ++ -> 2
//   i++ (i=2)

//    i=2 i<=sqrt(12) (2<=3) 
//    if(n%i==0) -> (12%2==0) -> true
//      count ++ -> 3
//    if(i!=n/i) -> (2!=12/2) -> true
//       count ++ -> 4
//   i++ (i=3)

//    i=3 i<=sqrt(12) (3<=3) 
//    if(n%i==0) -> (12%3==0) -> true
//       count ++ -> 5
//    if(i!=n/i) -> (2!=12/3) -> true
//      count ++ -> 6
//   i++ (i=4) 

//   i=4 i<=sqrt(12) (4<=3) -> false
// --------------End for loop -----------------

//     o/p : 
    
// Enter Number : 12
// 6
  
