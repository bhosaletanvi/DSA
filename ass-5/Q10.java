import java.util.Scanner;
public class All_prime_no {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n= sc.nextInt();
        int value=0;
        for (int i = 2; i <=n; i++) {
            for (int j =2 ; j <=i; j++) {
                if(i%j==0){
                 value=j;
                 break;
                }

        }
        if(value==i){
            System.out.print(" "+value);
          }
        
    }
    // System.err.println("hello");
    
}
}

// ----------------------- DRY RUN---------------------------
// n=5
// i=2 i<=n (2<=5) -> true
// j=2 j<=i (2<=2) -> true
//     if(i%j==0) 
//     if(2%2==0) -> true
//         value=j (2)
//         break 
// ---------------------end inner for loop------------------------
// if(value==i) (2==2) -> true
//     print i (2)
// i++ (i=3)

// i=3 i<=n (3<=5) -> true
// j=2 j<=i (2<=3) -> true
//     if(i%j==0) 
//     if(3%2==0) -> false 
//     j++ ( j=3)
//     if(3%3==0) -> true 
//         value=j (3)
//         break 
// ---------------------end inner for loop------------------------
// if(value==i) (3==3)-> true
//     print i (3)    
// i++ (i=4)    

// i=4 i<=n (4<=5) -> true
// j=2 j<=i (2<=4) -> true
//     if(4%j==0) 
//     if(4%2==0) -> true 
//         value=j (2)
//         break 
// ---------------------end inner for loop------------------------
// if(value==i) (2==4) -> false    
// i++ (i=5)      

// i=5 i<=n (5<=5) -> true
// j=2 j<=i (2<=5) -> true
//     if(i%j==0) 
//     if(5%2==0) -> false 
//     j++ ( j=3)
//     if(5%3==0) -> false 
//     j++ ( j=4)
//     if(5%4==0) -> false 
//     j++ ( j=5)
//     if(5%5==0) -> true 
//         value=j (5)
//         break 
// ---------------------end inner for loop------------------------
// if(value==i) (5==5)-> true
//     print i (5)    
// i++ (i=6)     

// i=6 i<=n (6<=5) -> false    
// -------------------end outer for loop --------------------------
// o/p: 
// Enter Number : 5
// 2 3 5

// Enter Number : 20
//  2 3 5 7 11 13 17 19    
