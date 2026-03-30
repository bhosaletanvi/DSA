import  java.util.Scanner;
public class GCD_EA{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b=sc.nextInt();
        int gcd=1;
        while(a!=0 && b!=0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a==0){
            gcd=b;
        }
        else{
            gcd=a;
        }
        System.out.print("Greatest Common Divisor : "+gcd);

    }
}

// ----------------------- DRY RUN------------------------------
//   a=20
//   b=28
//   gcd=1
//   while(a!=0 && b!=0)
//   while(20!=0 && 28!=0) -> true
//     if(a>b)-> false
//       b=b%a;
//       28=28%20 = 8

// while(a!=0 && b!=0)
// while(20!=0 && 8!=0) -> true
//     if(a>b)-> (20>8) -> true
//       a=a%b;
//       20=20%8 = 4       
        
// while(a!=0 && b!=0)
// while(4!=0 && 8!=0) -> true
//     if(a>b)-> (4>8) -> true
//       b=b%a;
//       8=8%4 = 0   

// while(a!=0 && b!=0)
// while(4!=0 && 0!=0) -> false

// if(a==0)
//   (4==0) -> false

// gcd=a -> 4
  
// Greatest Common Divisor : 4        

// ------------------ end while -----------------
//   o/p  :
// Enter 1st Number : 20
// Enter 2nd Number : 28
// Greatest Common Divisor : 4

// Enter 1st Number : 12
// Enter 2nd Number : 18
// Greatest Common Divisor : 6  
