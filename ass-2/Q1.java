import java.util.Scanner;
public class NHollow {
     void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n =sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                // if((i<=(n-1) && i>=2 ) && (j<=(n-1) && j>=2)){
                if(i==1||i==n||j==1||j==n){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
}

----------DRY RUN for n=3-----------
  n=3
  i=1 i<=n (1<=3) -> True 
    j=1 j<=n (1<=3) -> true 
       if(i==1 || i==n || j==1 || j==n)
       if(1==1 || 1==3 || 1==1 || 1==3)
       if(true || false|| true || False) -> True
           print *                                         o/p : *
       j++ (j=2) 
    j<=n (2<=3) -> True 
        if(i==1 || i==n || j==1 || j==n)
        if(1==1 || 1==3 || 2==1 || 2==3)
        if(true || false|| false || False) -> True
            print *                                          o/p : * *
        j++ (j=3) 
    j<=n (3<=3) -> True 
        if(i==1 || i==n || j==1 || j==n)
        if(1==1 || 1==3 || 3==1 || 3==3)
        if(true || false|| false || true) -> True
            print *                                            o/p : * * *
        j++ (j=4)
  j<=n (4<=3) -> False
--------------End inner loop-----------------   
Next Line 
i++ (i=2)

i=2 i<=n (2<=3) -> True 
    j=1 j<=n (1<=3) -> true 
       if(i==1 || i==n || j==1 || j==n)
       if(2==1 || 2==3 || 1==1 || 1==3)
       if(false || false|| true || False) -> True
           print *                                           o/p : * * *
       j++ (j=2)                                                   *
    j<=n (2<=3) -> True 
        if(i==1 || i==n || j==1 || j==n)
        if(2==1 || 2==3 || 2==1 || 2==3)
        if(false || false|| false || False) -> false
            print _                                          o/p : * * *
        j++ (j=3)                                                  * - 
    j<=n (3<=3) -> True 
        if(i==1 || i==n || j==1 || j==n)
        if(1==1 || 1==3 || 3==1 || 3==3)
        if(true || false|| false || true) -> True
            print *                                          o/p : * * *
        j++ (j=4)                                                  * - *
  j<=n (4<=3) -> False
--------------End inner loop-----------------  
Next Line 
i++ (i=3)  

i=3 i<=n (3<=3) -> True 
    j=1 j<=n (1<=3) -> true 
       if(i==1 || i==n || j==1 || j==n)
       if(3==1 || 3==3 || 1==1 || 1==3)
       if(false || true|| true || False) -> True
           print *                                           o/p : * * *
       j++ (j=2)                                                   * - *
    j<=n (2<=3) -> True                                            * 
        if(i==1 || i==n || j==1 || j==n)
        if(3==1 || 3==3 || 2==1 || 2==3)
        if(false || true|| false || False) -> false
            print *                                          o/p : * * *
        j++ (j=3)                                                  * - * 
    j<=n (3<=3) -> True                                            * *  
        if(i==1 || i==n || j==1 || j==n)
        if(3==1 || 3==3 || 3==1 || 3==3)
        if(true || true|| false || true) -> True
            print *                                          o/p : * * *
        j++ (j=4)                                                  * - *
  j<=n (4<=3) -> False                                             * * * 
--------------End inner loop----------------- 
  next Line 
  i++ (i=4) i<=n (4<=3) -> False
  -----------end outer loop-------------------

  Time compexity : O(n^2)
  Space Compexity : O(1)
  
  
