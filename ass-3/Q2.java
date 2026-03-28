public class NumButterfly {
    public static void main(String[] args) {
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j<=i ; j++){
              System.out.print(j);
            }
            for (int k =1; k <=2*(4-i); k++) {
                System.out.print(" ");
            }
            for (int m =i; m>=1; m--){
                System.out.print(m);
            }
            System.out.println();
        }


        for (int i =4; i>=1; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            for (int k = 1; k<=2*(4-i); k++) {
                System.out.print(" ");
            }
            for (int m=i; m>=1; m--){
               System.out.print(m);
            }
            System.out.println();
        }
    }
}

// -----------------------=-----DRY RUN for n=3------------------------------
//   n=3
//   i=1 i<=n (1<=3) -> true
//     j=1 j<=i (1<=1) -> true
//       print i (1)
//       j++ (j=2)
//    j=2 j<=i (2<=1) -> false
// ---------------------end 1st inner loop--------------------------- 
// k=1  k<=2(n-i) (1<=4) -> true
//     print _
//     k++ (k=2)
// k=2  k<=2(n-i) (2<=4) -> true
//     print _
//     k++ (k=3)  
// k=3  k<=2(n-i) (3<=4) -> true
//     print _
//     k++ (k=4) 
// k=4  k<=2(n-i) (4<=4) -> true
//     print _
//     k++ (k=5)  
// k=1  k<=2(n-i) (1<=4) -> false
// ----------------- End 2ns inner loop ------------------------------
// m=i (m=1) m>=1 (1>=1) -> true
//   print m (1)
//   m-- (m=0)
// m=i (m=0) m>=1 (0>=1) -> false
// ------------------End 3rd inner loop ------------------------------- 
//   next line 
//   i++ (i=2)
  
// i=2 i<=n (2<=3) -> true
//     j=1 j<=i (1<=2) -> true
//       print i (1)
//       j++ (j=2)
//    j=2 j<=i (2<=2) -> true
//        print i (2)
//       j++ (j3)
//    j=3 j<=i (3<=2) -> false
// ---------------------end 1st inner loop--------------------------- 
// k=1  k<=2(n-i) (1<=2) -> true
//     print _
//     k++ (k=2)
// k=2  k<=2(n-i) (2<=2) -> true
//     print _
//     k++ (k=3)  
// k=3  k<=2(n-i) (3<=2) -> false
// ----------------- End 2ns inner loop ------------------------------
// m=i (m=2) m>=1 (2>=1) -> true
//   print m (1)
//   m-- (m=1)
// m=i (m=1) m>=1 (1>=1) -> true
//     print m (2)
//     m-- (m=0)
// m=i (m=0) m>=1 (0>=1) -> false
// ------------------End 3rd inner loop ------------------------------- 
//   next line 
//   i++ (i=3)  

  
// i=3 i<=n (3<=3) -> true
//     j=1 j<=i (1<=3) -> true
//       print i (1)
//       j++ (j=2)
//    j=2 j<=i (2<=3) -> true
//        print i (2)
//       j++ (j=3)
//    j=3 j<=i (3<=3) -> true
//       print i (3)
//       j++ (j=4)
//    j=4 j<=i (4<=3) -> false
// ---------------------end 1st inner loop--------------------------- 
// k=1  k<=2(n-i) (1<=0) -> false
// ----------------- End 2ns inner loop ------------------------------
// m=i (m=3) m>=1 (3>=1) -> true
//   print m (3)
//   m-- (m=2)
// m=i (m=2) m>=1 (2>=1) -> true
//     print m (2)
//     m-- (m=1)
// m=i (m=1) m>=1 (1>=1) -> true
//      print m (1)
//      m-- (m=0)
// m=i (m=0) m>=1 (0>=1) -> false
// ------------------End 3rd inner loop ------------------------------- 
//   next line 
//   i++ (i=4)
//   i<=n (4<=3) -> false
// ---------------------end 1st outer loop --------------------------

// i=n (i=3) i>=1 (3>=1) -> true
//   j=1 j<=i (1<=3) -> true
//     print j (1)
//     j++ (j=2)
//  j=2 j<=i (2<=3) -> true
//     print j (2)
//     j++ (j=3)
//  j=3 j<=i (3<=3) -> true
//     print j (3)
//     j++ (j=4) 
//   j=4 j<=i (4<=3) -> false
// -------------------- End 1st inner loop-------------------------
//  k=1 k<=2(n-i) (1<=0)   -> false
// --------------------- End 2nd inner loop -----------------------
// m=i (m=3) m>=1 (3>=1) -> true
//   print m (3)
//   m-- (m=2)
// (m=2) m>=1 (2>=1) -> true
//   print m (2)
//   m-- (m=1)
// (m=1) m>=1 (1>=1) -> true
//   print m (1)
//   m-- (m=0)
// (m=0) m>=1 (0>=1) -> false
// -------------------------End 3rd inner loop ----------------------
//  next line 
//   i-- (i=2)
  
// (i=2) i>=1 (2>=1) -> true
//   j=1 j<=i (1<=2) -> true
//     print j (1)
//     j++ (j=2)
//  j=2 j<=i (2<=2) -> true
//     print j (2)
//     j++ (j=3)
//  j=3 j<=i (3<=2) -> false
  
// -------------------- End 1st inner loop-------------------------
//  k=1 k<=2(n-i) (1<=2)   -> true
//   print _
//   k++ (k=2)
//  k=2 k<=2(n-i) (2<=2)   -> true
//   print _
//   k++ (k=3)  
//  k=3 k<=2(n-i) (3<=2)   -> false  
// --------------------- End 2nd inner loop -----------------------
// m=i (m=2) m>=1 (2>=1) -> true
//   print m (2)
//   m-- (m=1)
// (m=1) m>=1 (1>=1) -> true
//   print m (1)
//   m-- (m=0)
// (m=0) m>=1 (0>=1) -> false
// -------------------------End 3rd inner loop ----------------------
//  next line 
//   i-- (i=1) 

// (i=1) i>=1 (1>=1) -> true
//   j=1 j<=i (1<=1) -> true
//     print j (1)
//     j++ (j=2)
//  j=2 j<=i (2<=2) -> false
// -------------------- End 1st inner loop-------------------------
//  k=1 k<=2(n-i) (1<=4)   -> true
//   print _
//   k++ (k=2)
//  k=2 k<=2(n-i) (2<=4)   -> true
//   print _
//   k++ (k=3)  
//  k=3 k<=2(n-i) (3<=4)   -> true  
//    print _
//    k++ (k=4)  
//  k=4 k<=2(n-i) (4<=4)   -> true  
//    print _
//    k++ (k=5)  
//  k=5 k<=2(n-i) (5<=4)   -> false  
// --------------------- End 2nd inner loop -----------------------
// m=i (m=1) m>=1 (1>=1) -> true
//   print m (1)
//   m-- (m=0)
// (m=0) m>=1 (0>=1) -> false
// -------------------------End 3rd inner loop ----------------------
//  next line 
//   i-- (i=0)
//   i>=1 -> false 

// o/p : 1 - - - - 1
//       1 2 - - 2 1
//       1 2 3 3 2 1
//       1 2 3 3 2 1
//       1 2 - - 2 1
//       1 - - - - 1
