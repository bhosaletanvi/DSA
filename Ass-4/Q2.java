public class FourHnum{
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=4;i++){
            for(j=1;j<=4;j++){
                System.out.print(" "+i);
            }
            System.err.println();
        }
    }
}

// -----------DRY RUN -------------
//   i=1 i<=4 (1<=4) -> true 
//   enter into outer loop
//    j=1 j<=4 (1<=4) -> True
//          Print i -> print 1               o/p : 1
//          j++ (j=2) 
//     j<=4 (2<=4) -> true
//          print i -> print 1              o/p : 1 1
//          j++ (j=3)
//     J<=4 (3<=4) -> true
//          print i -> print 1               o/p : 1 1 1 
//           j++ (j=4)
//   j<=4 (4=4) -> True 
//          print i -> print 1               o/p : 1 1 1 1
//          j++ (j=5)
//   j<=4 (5<=4) -> False
//   ------end inner loop---------
//   next Line 
//   i++ (i=2)
//    i=2 i<=4 (2<=4) -> true 
  // enter into outer loop
  //  j=1 j<=4 (1<=4) -> True
  //        Print i -> print 2               o/p : 1 1 1 1
  //        j++ (j=2)                              2
  //   j<=4 (2<=4) -> true
  //        print i -> print 2              o/p : 1 1 1 1
  //        j++ (j=3)                             2 2
  //   J<=4 (3<=4) -> true
  //        print i -> print 2               o/p : 1 1 1 1 
  //         j++ (j=4)                             2 2 2
  // j<=4 (4=4) -> True 
  //        print i -> print 2               o/p : 1 1 1 1
  //        j++ (j=5)                              2 2 2 2 
  // j<=4 (5<=4) -> False
  // ------end inner loop---------
  // next Line 
  //  i=3 i<=4 (3<=4) -> true 
  // enter into outer loop
  //  j=1 j<=4 (1<=4) -> True
  //        Print i -> print 3               o/p : 1 1 1 1 
  //        j++ (j=2)                              2 2 2 2
  //   j<=4 (2<=4) -> true                         3
  //        print i -> print 3              o/p : 1 1 1 1
  //        j++ (j=3)                             2 2 2 2
  //   J<=4 (3<=4) -> true                        3 3
  //        print i -> print 3   -----|            
  //         j++ (j=4)                |---->  o/p : 1 1 1 1
  //                                                2 2 2 2 
  //                                                3 3 3  
  // j<=4 (4=4) -> True 
  //        print i -> print 3               o/p : 1 1 1 1
  //        j++ (j=5)                              2 2 2 2 
 //         j<=4 (5<=4) -> False                   3 3 3 3
 //  ------end inner loop---------
 //  next Line 
 //  i++ (i=4)
 // i=4  i<=4 (4<=4) -> true 
 //  enter into outer loop
 //   j=1 j<=4 (1<=4) -> True
 //         Print i -> print 4               o/p : 1 1 1 1 
 //         j++ (j=2)                              2 2 2 2
 //    j<=4 (2<=4) -> true                         3 3 3 3
 //                                                4 
 //         print i -> print 4              o/p : 1 1 1 1
 //         j++ (j=3)                             2 2 2 2
                                               // 3 3 3 3
                                               // 4 4       
 //    J<=4 (3<=4) -> true                        
 //         print i -> print 4   -----|            
 //          j++ (j=4)                |---->  o/p : 1 1 1 1
 //                                                 2 2 2 2 
 //                                                 3 3 3 3 
 //  j<=4 (4=4) -> True                             4 4 4  
 //         print i -> print 4               o/p : 1 1 1 1
 //         j++ (j=5)                              2 2 2 2 
 //         j<=4 (5<=4) -> False                   3 3 3 3
 //  ------end inner loop---------                 4 4 4 4
 //  next Line 
 // i++ i=5 i<=4 (5<=4) -> False 
 //  ------- end Outer loop-------

 //  time Compexity : O(n^2) ->O(16)
 //  space Compexity : O(1)
  
  
      
