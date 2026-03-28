import  java.util.Scanner;
public class GCD_BF{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b=sc.nextInt();
        int gcd=0;
        for (int i = 1; i <Math.min(a,b); i++) {
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.print("Greatest Common Divisor : "+gcd);

    }
}

// ----------------------------DRY RUN---------------------------------
// a=10
// b=8
// gcd=0
// i=1 (i<=Math.min(a,b)) -> (1<=8) ->  true
//   if(a%i==0 && b%i==0)
//     (10%1==0 && 8%1==0) -> true
//      gcd=1
//   i++ (i=2) 

// i=2 (i<=Math.min(a,b)) -> (2<=8) ->  true
//   if(a%i==0 && b%i==0)
//     (10%2==0 && 8%2==0) -> true
//      gcd=2
//   i++ (i=3)

// i=3 (i<=Math.min(a,b)) -> (3<=8) ->  true
//   if(a%i==0 && b%i==0)
//     (10%3==0 && 8%3==0) -> false
    
//   i++ (i=4)

// i=4 (i<=Math.min(a,b)) -> (4<=8) ->  true
//   if(a%i==0 && b%i==0)
//     (10%4==0 && 8%4==0) -> false
     
//   i++ (i=5)   

// i=5 (i<=Math.min(a,b)) -> (5<=8) ->  true
//   if(a%i==0 && b%i==0)
//     (10%5==0 && 8%5==0) -> false
     
//   i++ (i=6)   

// i=6 (i<=Math.min(a,b)) -> (6<=8) ->  true
//   if(a%i==0 && b%i==0)
//     (10%6==0 && 8%6==0) -> false
     
//   i++ (i=7)  

// i=7 (i<=Math.min(a,b)) -> (7<=8) ->  true
//   if(a%i==0 && b%i==0)
//     (10%7==0 && 8%7==0) -> false
     
//   i++ (i=8)   

// i=8 (i<=Math.min(a,b)) -> (8<=8) ->  true
//   if(a%i==0 && b%i==0)
//     (10%8==0 && 8%8==0) -> false
     
//   i++ (i=9)   

// i=9 (i<=Math.min(a,b)) -> (9<=8) ->  false
  
// ------------------ End For Loop-----------------------  
//   print gcd (2)

//   o/p: 
// Enter 1st Number : 10
// Enter 2nd Number : 8
// Greatest Common Divisor : 2

// Enter 1st Number : 12
// Enter 2nd Number : 18
// Greatest Common Divisor : 6

// Enter 1st Number : 20
// Enter 2nd Number : 28
// Greatest Common Divisor : 4  
