import java.util.*;
public class RightTriangle {
    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}

------------------DRY RUN for 3--------------------
  n=3
  i=1 i<=n (1<=3) -> true
    j=i (j=1)  j<=n (1<=3) -> true
      print *                     o/p : *
      j++ (j=2)
   j=2 j<=n (2<=3) -> true
      print *                     o/p : * *
      j++ ( j=3)
  j= 3 j<=n (3<=3) -> 
      print *                     o/p : * * *
      j++ (j=4)
  j=4 j<=n (4<=3) -> false 
  --------------end inner loop ---------------------
  next line 
  i++ (i=2)
  i=2 i<=n (2<=3) -> true
    j=2 j<=n (2<=3) -> true
      print *                     o/p : * * *
      j++ (j=3)                         * 
    j=3 j<=n (3<=3) -> true
        print *                     o/p : * * *
      j++ (j=4)                           * * 
    j=4 j<=n (4<=3) -> false
  --------------end inner loop ---------------------
  next line 
  i++ (i=3)
    j=i j<=n (3<=3) -> true
        print *                     o/p : * * *
      j++ (j=4)                           * * 
                                          * 
----------------------end inner loop-------------------
  next line 
  i++ (i=4)
  i<=n (4<=3) -> false
  -------------------- end outer loop -----------------
  
  time Complexity : O(n^2)
  space Complexity : O(1)
  
