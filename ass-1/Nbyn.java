import java.util.Scanner;
public class Nbyn{
public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Number : ");

    int n =s.nextInt();
    int i,j;
    for(i=1;i<=n;i++){
        for(j=1;j<=n;j++){
            System.err.print("* ");
        }
        System.out.println();
    }
}
}


// ----------DRY run for 3 -----------
// n=3
// i=1 i<=n (1<=3) -> True 
//   j=1 j<=n (1<=3) -> true
//     print *_
//     j++ -> (j=2)
//       j<=n (2<=3) -> true 
//       print *_
//       j++ ->(j=3)
//         j<=n (3=3) -> true
//         print *_  
//         j++ -> (j=4)
//         j<=n (4<=3) -> False
//  --------End inner Loop----------       
// next Line 
// i++ (i=2) 
//  i=2 i<=n (2<=3) -> True 
//   j=1 j<=n (1<=3) -> true
//     print *_
//     j++ -> (j=2)
//       j<=n (2<=3) -> true 
//       print *_
//       j++ ->(j=3)
//         j<=n (3=3) -> true
//         print *_  
//         j++ -> (j=4)
//         j<=n (4<=3) -> False
//  --------End inner Loop----------       
// next Line 
// i++ (i=3)
// i=3 i<=n (3<=3) -> True 
//   j=1 j<=n (1<=3) -> true
//     print *_
//     j++ -> (j=2)
//       j<=n (2<=3) -> true 
//       print *_
//       j++ ->(j=3)
//         j<=n (3=3) -> true
//         print *_  
//         j++ -> (j=4)
//         j<=n (4<=3) -> False
//  --------End inner Loop----------       
// next Line     
// i++ (i=4)
// i=4 i<=n (4<=3) -> False     
// --------outer loop end-----------   

//     Output : 
//     * * *
//     * * * 
//     * * *


    
      
