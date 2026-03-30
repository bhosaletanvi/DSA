public class FourHnum{
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=4;i++){
            for(j=1;j<=4;j++){
                System.out.print(" "+j);
            }
            System.err.println();
        }
    }
}

// -----------DRY RUN -------------
//   i=1 i<=4 (1<=4) -> true 
//   enter into outer loop
//    j=1 j<=4 (1<=4) -> True
//          Print j -> print 1               o/p : 1
//          j++ (j=2) 
//     j<=4 (2<=4) -> true
//          print j -> print 2              o/p : 1 2
//          j++ (j=3)
//     J<=4 (3<=4) -> true
//          print j -> print 3               o/p : 1 2 3 
//           j++ (j=4)
//   j<=4 (4=4) -> True 
//          print j -> print 4               o/p : 1 2 3 4
//          j++ (j=5)
//   j<=4 (5<=4) -> False
//   ------end inner loop---------
//   next Line 
//   i++ (i=2)
//    i=2 i<=4 (2<=4) -> true 
  // enter into outer loop
  //  j=1 j<=4 (1<=4) -> True
  //        Print j -> print 1               o/p : 1 2 3 4
  //        j++ (j=2)                              1 
  //   j<=4 (2<=4) -> true
  //        print j -> print 2              o/p : 1 2 3 4
  //        j++ (j=3)                             1 2
  //   J<=4 (3<=4) -> true
  //        print j -> print 3               o/p : 1 2 3 4 
  //         j++ (j=4)                             1 2 3
  // j<=4 (4=4) -> True 
  //        print j -> print 4               o/p : 1 2 3 4
  //        j++ (j=5)                              1 2 3 4 
  // j<=4 (5<=4) -> False
  // ------end inner loop---------
  // next Line 
  //  i=3 i<=4 (3<=4) -> true 
  // enter into outer loop
  //  j=1 j<=4 (1<=4) -> True
  //        Print j -> print 1               o/p : 1 2 3 4
  //        j++ (j=2)                              1 2 3 4
  //   j<=4 (2<=4) -> true                         1
  //        print j -> print 2              o/p : 1 2 3 4
  //        j++ (j=3)                             1 2 3 4
  //   J<=4 (3<=4) -> true                        1 2 
  //        print j -> print 3   -----|            
  //         j++ (j=4)                |---->  o/p : 1 2 3 4
  //                                                1 2 3 4 
  //                                                1 2 3   
  // j<=4 (4=4) -> True 
  //        print j -> print 4               o/p : 1 2 3 4
  //        j++ (j=5)                              1 2 3 4
 //         j<=4 (5<=4) -> False                   1 2 3 4
 //  ------end inner loop---------
 //  next Line 
 //  i++ (i=4)
 // i=4  i<=4 (4<=4) -> true 
 //  enter into outer loop
 //   j=1 j<=4 (1<=4) -> True
 //         Print j -> print 1               o/p : 1 2 3 4 
 //         j++ (j=2)                              1 2 3 4
 //    j<=4 (2<=4) -> true                         1 2 3 4
 //                                                1 
 //         print j -> print 2              o/p : 1 2 3 4
 //         j++ (j=3)                             1 2 3 4
                                               // 1 2 3 4
                                               // 1 2       
 //    J<=4 (3<=4) -> true                        
 //         print j -> print 3   -----|            
 //          j++ (j=4)                |---->  o/p : 1 2 3 4
 //                                                 1 2 3 4
 //                                                 1 2 3 4
 //  j<=4 (4=4) -> True                             1 2 3   
 //         print j -> print 4               o/p : 1 2 3 4
 //         j++ (j=5)                              1 2 3 4 
 //         j<=4 (5<=4) -> False                   1 2 3 4
 //  ------end inner loop---------                 1 2 3 4
 //  next Line 
 // i++ i=5 i<=4 (5<=4) -> False 
 //  ------- end Outer loop-------


  
  
      
