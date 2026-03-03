public class Crossnum {
    public static void main(String[] args) {
      int n=5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(i==j){
                    System.err.print(j);
                }
                else{
                    System.out.print(" ");
                }
                if(i+j==(n+1) && i!=j){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// -------------------- DRY RUN for n=3--------------------------
//   i=1 i<=n (1<=3) -> true
//     j=1 j<=n (1<=3) -> true
//       if(i==j)
//       if(1==1) -> true
//         print j (1)
//       if(i+j==(n+1) && i!=j) -> (2==4 &&  1!=1) -> false 
//         print _
//       j++ (j=2)
//    j=2 j<=n (2<=3) -> true
//       if(i==j)
//       if(1==2) -> false
//         print _
//       if(i+j==(n+1) && i!=j) -> (3==4 &&  1!=2) -> false 
//         print _
//       j++ (j=3)
//    j=3 j<=n (3<=3) -> true
//       if(i==j)
//       if(1==3) -> false
//         print _
//       if(i+j==(n+1) && i!=j) -> (4==4 &&  1!=4) -> true 
//         print i(1)
//       j++ (j=4)
//   j<=n (4<=3) -> false 
//   --------------------End inner loop---------------------------
//   next line
//   i++ (i=2) 

//     i=2 i<=n (2<=3) -> true
//     j=1 j<=n (1<=3) -> true
//       if(i==j)
//       if(2==1) -> false
//         print _
//       if(i+j==(n+1) && i!=j) -> (3==4 &&  2!=1) -> false 
//         print _
//       j++ (j=2)
//    j=2 j<=n (2<=3) -> true
//       if(i==j)
//       if(2==2) -> true
//         print j(2)
//       if(i+j==(n+1) && i!=j) -> (4==4 &&  2!=2) -> false 
//         print _
//       j++ (j=3)
//    j=3 j<=n (3<=3) -> true
//       if(i==j)
//       if(2==3) -> false
//         print _
//       if(i+j==(n+1) && i!=j) -> (5==4 &&  2!=3) -> true 
//         print i(2)
//       j++ (j=4)
//   j<=n (4<=3) -> false 
//   --------------------End inner loop---------------------------
//   next line
//   i++ (i=3) 

//     i=3 i<=n (3<=3) -> true
//     j=1 j<=n (1<=3) -> true
//       if(i==j)
//       if(3==1) -> false
//         print _
//       if(i+j==(n+1) && i!=j) -> (4==4 &&  3!=1) -> true 
//         print j(1)
//       j++ (j=2)
//    j=2 j<=n (2<=3) -> true
//       if(i==j)
//       if(3==2) -> false
//         print _
//       if(i+j==(n+1) && i!=j) -> (5==4 &&  3!=2) -> false 
//         print _
//       j++ (j=3)
//    j=3 j<=n (3<=3) -> true
//       if(i==j)
//       if(3==3) -> true
//         print j(3)
//       if(i+j==(n+1) && i!=j) -> (6==4 &&  3!=4) -> false 
//         print _
//       j++ (j=4)
//   j<=n (4<=3) -> false 
//   --------------------End inner loop---------------------------
//   next line
//   i++ (i=4) 
//   i<=n (4<=3) -> false 
//   --------------------End outer loop -----------------------------

//   o/p : 1 - 1
//         - 2 -
//         1 - 1
