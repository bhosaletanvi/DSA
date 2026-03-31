public class DOubleNoPyramid {
    public static void main(String[] args) {
        for (int i = 1; i <=4; i++) {
            for (int j = 3; j>=i; j--) {
                System.out.print(" ");
            }
            for (int k =1; k <=i; k++) {
                System.out.print(" "+k);
            }
            System.out.println();
        }

        for (int i = 3; i >=1; i--) {
            for (int j = i; j<=3; j++) {
                System.out.print(" ");
                
            }
            for (int k = 1; k <=i; k++){
                System.out.print(" "+k);
            }
            System.out.println();
        }  
    }
}

// -------------------------- DRY RUN ----------------------------
//   i=1 i<=4 (1<=4) -> True
//      j=3 j>=i (3>=1) -> true
//          print _                                o/p : -
//          j-- (j=2)
//     j=2 j>=i (2>=1) -> True
//         print _                                  o/p : - - 
//         j-- (j=1)
//     j=1 j>=i (1>=1) -> true
//         print _                                  o/p : - - -
//         j-- (j=0)
//     j=0 j>=i (0>=1) -> false 
//   --------------- End 1st inner loop ---------------------------
//       k=1 k<=i (1<=1) -> true
//          print K                                  o/p : - - - 1
//          k++ (k=2)
//       k=2 k<=i (2<=1) -> false
//  --------------------- End 2ns inner loop-----------------------       
//  next line 
//   i++ (i=2)


//  i=2 i<=4 (2<=4) -> True
//      j=3 j>=i (3>=2) -> true
//          print _                                o/p : - - - 1
//          j-- (j=2)                                    -    
//     j=2 j>=i (2>=2) -> True
//         print _                                  o/p : - - - 1
//         j-- (j=1)                                      - -
//     j=1 j>=i (1>=2) -> false
//   --------------- End 1st inner loop ---------------------------
//       k=1 k<=i (1<=2) -> true
//          print K                                  o/p : - - - 1
//          k++ (k=2)                                      - - 1
//       k=2 k<=i (2<=2) -> true
//          print K                                  o/p : - - - 1
//          k++ (k=3)                                      - - 1   2
//       k=2 k<=i (3<=2) -> false
//  --------------------- End 2ns inner loop-----------------------       
//  next line 
//   i++ (i=3)  


//  i=3 i<=4 (3<=4) -> True
//      j=3 j>=i (3>=3) -> true
//          print _                                o/p : - - - 1
//          j-- (j=2)                                    - - 1   2  
//     j=2 j>=i (2>=3) -> false                          - 
//   --------------- End 1st inner loop ---------------------------
//       k=1 k<=i (1<=3) -> true
//          print K                                  o/p : - - - 1
//          k++ (k=2)                                      - - 1   2
//                                                         - 1    
  
//       k=2 k<=i (2<=3) -> true                          
//          print K                                  o/p : - - - 1
//          k++ (k=3)                                      - - 1   2
//                                                         - 1   2    
  
//       k=2 k<=i (3<=3) -> true                              
//           print k                                  o/p : - - - 1
//           k++ (k=4)                                      - - 1   2
//                                                          - 1   2   3  
//       k=4 k<=i (4<=3) -> false     
//  --------------------- End 2ns inner loop-----------------------       
//  next line 
//   i++ (i=4)  

  
// i=4 i<=4 (4<=4) -> true 
// j=3 j>=i (3>=4) -> false
// ------------------ End 1st inner loop ---------------------------
//       k=1 k<=i (1<=4) -> true
//          print K                                  o/p : - - - 1
//          k++ (k=2)                                      - - 1   2
//                                                         - 1   2   3 
//                                                         1     
//       k=2 k<=i (2<=4) -> true                          
//          print K                                  o/p : - - - 1
//          k++ (k=3)                                      - - 1   2
//                                                         - 1   2   3   
//                                                         1   2
//       k=2 k<=i (3<=4) -> true                              
//           print k                                  o/p : - - - 1
//           k++ (k=4)                                      - - 1   2
//                                                          - 1   2   3   
//                                                          1   2   3
//       k=4 k<=i (4<=4) -> true                           
//         print k                                     o/p :  - - - 1
//         k++ (k=5)                                          - - 1   2
//                                                            - 1   2   3   
//                                                            1   2   3   4 
//       k=4 k<=i (5<=4) -> false
//  --------------------- End 2ns inner loop-----------------------------       
//  next line 
//   i++ (i=5)  
// i=4 i<=4 (5<=4) -> false 
// ------------------------ End 1st outer loop---------------------------  
  

// i=3  i>=1 (3>=1) -> true
//   j=i (j=3) j<=3 (3<=3) -> true
//     print _                                           o/p :  - - - 1
//     j++ (j=4)                                                - - 1   2
//                                                              - 1   2   3   
//  j=i (j=4) j<=3 (4<=3) -> false                              1   2   3   4     
// -----------------End 1st inner loop -------------------      -       
//  k=1 k<=i (1<=3) -> true
//      print K                                          
//      k++ (k=2)
// k=2 k<=i (2<=3) -> true
//      print K                                          
//      k++ (k=3)
// k=3 k<=i (3<=3) -> true                               o/p : - - - 1    
//      print K                                                - - 1   2
//      k++ (k=4)                                              - 1   2   3  
// k=4 k<=i (4<=3) -> false                                    1   2   3   4
//                                                             - 1   2   3
// ----------------------End 2nd inner loop ------------------------------
// next line 
// i-- (i=2)

  
// i=2  i>=1 (2>=1) -> true
//   j=i (j=2) j<=3 (2<=3) -> true
//     print _                                           o/p :  - - - 1
//     j++ (j=3)                                                - - 1   2
//                                                              - 1   2   3   
//    (j=3) j<=3 (3<=3) -> true                                 1   2   3   4
//   print _                                                    - 1   2   3
//   j++ (j=4)                                                  - -

// j=i (j=4) j<=3 (4<=3) -> false  
// -----------------End 1st inner loop -------------------            
//  k=1 k<=i (1<=2) -> true
//      print K                                          o/p : - - - 1
//      k++ (k=2)                                              - - 1   2
// k=2 k<=i (2<=2) -> true                                     - 1   2   3 
//      print K                                                1   2   3   4
//      k++ (k=3)                                              - 1   2   3    
//                                                             - - 1   2
// k=3 k<=i (3<=2) -> false                                   
                                                            
// ----------------------End 2nd inner loop ------------------------------
// next line 
// i-- (i=1)
  
  
// i=1  i>=1 (1>=1) -> true
//   j=i (j=1) j<=3 (1<=3) -> true
//     print _                                           o/p :  - - - 1
//     j++ (j=1)                                                - - 1   2
//                                                              - 1   2   3   
//  (j=2) j<=3 (1<=3) -> true                                   1   2   3   4
//   print _                                                    - 1   2   3
//   j++ (j=3)                                                  - - 1   2
//                                                              - - - 
//   (j=3) j<=3 (3<=3) -> true                               
//   print _                                                 
//   j++ (j=4)
  
//   (j=4) j<=3 (4<=3) -> false 
// -----------------End 1st inner loop -------------------            
//  k=1 k<=i (1<=1) -> true
//      print K                                          o/p : - - - 1
//      k++ (k=2)                                              - - 1   2
// k=2 k<=i (2<=1) -> false                                     - 1   2   3 
//                                                             1   2   3   4
//                                                             - 1   2   3 
//                                                             - - 1   2
//                                                             - - - 1 
// ----------------------End 2nd inner loop ------------------------------
// i-- ( i=0)
//   i>=1 -> false
// ------------------------End 2nd outer loop ----------------------------  
  
