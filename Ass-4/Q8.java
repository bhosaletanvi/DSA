import java.util.Scanner;
public class ChessBoard {
    void main(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number :");
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(((i+j)%2==0)){
                    System.out.print(" *");
                }
                else{
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
    }
    
}

// ------------------- DRY RUN for 3 ----------------------------
//   n=3
//   i=1 i<=n (1<=3) -> true
//     j=1 j<=n (1<=3) -> true
//       if((i+j)%2==0)
//       if((1+1)%2==0) --> 2%2==0 -> true
//         print *                                 o/p : *
//         j++ (j=2)
  
//     j=2 j<=n (2<=3) -> true
//        if((i+j)%2==0)
//        if((1+2)%2==0) --> 3%2==0 -> false
//         print #                                 o/p : * #
//         j++ (j=3)
  
//    j=3 j<=n (3<=3) -> true
//        if((i+j)%2==0)
//        if((1+3)%2==0) --> 4%2==0 -> true
//         print *                                 o/p : * # *
//         j++ (j=4)

//   j=4 j<=n (4<=3) -> false 
//  ------------------------ End Inner Loop ------------------------
//   next line
//   i++ (i=2)

   //  i=2 i<=n (2<=3) -> true
   //  j=1 j<=n (1<=3) -> true
   //    if((i+j)%2==0)
   //    if((2+1)%2==0) --> 3%2==0 -> false
   //      print #                                 o/p : * # *
   //      j++ (j=2)                                     #
  
   //  j=2 j<=n (2<=3) -> true
   //     if((i+j)%2==0)
   //     if((2+2)%2==0) --> 4%2==0 -> true
   //      print *                                 o/p : * # *
   //      j++ (j=3)                                     # *  
  
   // j=3 j<=n (3<=3) -> true
   //     if((i+j)%2==0)
   //     if((2+3)%2==0) --> 5%2==0 -> false
   //      print #                                 o/p : * # *
 //        j++ (j=4)                                     # * #             

 //  j=4 j<=n (4<=3) -> false 
 // ------------------------ End Inner Loop ------------------------
 //  next line
 //  i++ (i=3)

 //    i=3 i<=n (3<=3) -> true
 //    j=1 j<=n (1<=3) -> true
 //      if((i+j)%2==0)
 //      if((3+1)%2==0) --> 4%2==0 -> true
 //        print *                                 o/p : * # *
 //        j++ (j=2)                                     # * #   
 //                                                      *
 //    j=2 j<=n (2<=3) -> true
 //       if((i+j)%2==0)
 //       if((3+2)%2==0) --> 5%2==0 -> false
 //        print #                                 o/p : * # *
 //        j++ (j=3)                                     # * #
 //                                                      * #
 //   j=3 j<=n (3<=3) -> true
 //       if((i+j)%2==0)
 //       if((3+3)%2==0) --> 6%2==0 -> true
 //        print *                                 o/p : * # *
 //        j++ (j=4)                                     # * #
 //                                                      * # *
 //  j=4 j<=n (4<=3) -> false 
 // ------------------------ End Inner Loop ------------------------
 //  next line
 //  i++ (i=4)
 //  i=4 i<=n (4<=3) -> False
 //  ------------------------- End Outer Loop------------------------
  
 //  time Complexity : o( n^2)
 //  Space Complexity : O(1)
  
