import java.util.*;
public class spiralLayer{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=sc.nextInt();
        int total_rows=2*n-1;
        int total_cols=2*n-1;
        for (int i = 1; i <=total_rows; i++) {
            for (int j = 1; j <=total_cols; j++) {
                int top = i-1;
                int bottom= 2*n-1-i;
                int left =j-1;
                int right=2*n-1-j;
                int smallestTopBottom=Math.min(top, bottom);
                int smallestLeftRight=Math.min(left, right);
                int smallest=Math.min(smallestTopBottom,smallestLeftRight);
                int layer_no=smallest;
                System.out.print(" "+(n-layer_no));
                
            }
            System.out.println();
        }
    }
}

// ----------------------------- DRY RUN for 3 --------------------------
//   n=3
//   total_rows = 2*n-1 -> (2*3-1) -> 5
//   total_cols = 2*n-1 -> (2*3-1) -> 5
//   i =1 i<=total_rows (1<=5) -> true
//       j =1 j<=total_cols (1<=5) -> true
//         top= i-1 (1-1) -> 0
//         bottom = 2*n-1-i (2*3-1-1) -> 4
//         left =j-1 (1-1) -> 0
//         right = 2*n-1-j (2*3-1-1) -> 4
//         smallestTopBottom=Math.min(top, bottom) = (0,4) -> 0
//         smallestLeftRight=Math.min(left, right) = (0,4) -> 0
//         smallest=Math.min(smallestTopBottom,smallestLeftRight) (0,0) -> 0
//         layer_no =smallest -> 0
//         print (n-layer_no) -> (3-0) -> 3
//         j++ (j=2)
  
//     j =2 j<=total_cols (2<=5) -> true
//         top= i-1 (1-1) -> 0
//         bottom = 2*n-1-i (2*3-1-1) -> 4
//         left =j-1 (2-1) -> 1
//         right = 2*n-1-j (2*3-1-2) -> 3
//         smallestTopBottom=Math.min(top, bottom) = (0,4) -> 0
//         smallestLeftRight=Math.min(left, right) = (1,3) -> 1
//         smallest=Math.min(smallestTopBottom,smallestLeftRight) (0,1) -> 0
//         layer_no =smallest -> 0
//         print (n-layer_no) -> (3-0) -> 3
//         j++ (j=3)

//   j =3 j<=total_cols (3<=5) -> true
//         top= i-1 (1-1) -> 0
//         bottom = 2*n-1-i (2*3-1-1) -> 4
//         left =j-1 (3-1) -> 2
//         right = 2*n-1-j (2*3-1-3) -> 2
//         smallestTopBottom=Math.min(top, bottom) = (0,4) -> 0
//         smallestLeftRight=Math.min(left, right) = (2,2) -> 2
//         smallest=Math.min(smallestTopBottom,smallestLeftRight) (0,2) -> 0
//         layer_no =smallest -> 0
//         print (n-layer_no) -> (3-0) -> 3
//         j++ (j=4)

//   j =4 j<=total_cols (4<=5) -> true
//         top= i-1 (1-1) -> 0
//         bottom = 2*n-1-i (2*3-1-1) -> 4
//         left =j-1 (4-1) -> 3
//         right = 2*n-1-j (2*3-1-4) -> 1
//         smallestTopBottom=Math.min(top, bottom) = (0,4) -> 0
//         smallestLeftRight=Math.min(left, right) = (3,1) -> 1
//         smallest=Math.min(smallestTopBottom,smallestLeftRight) (0,1) -> 0
//         layer_no =smallest -> 0
//         print (n-layer_no) -> (3-0) -> 3
//         j++ (j=5)

//  j =5 j<=total_cols (5<=5) -> true
//         top= i-1 (1-1) -> 0
//         bottom = 2*n-1-i (2*3-1-1) -> 4
//         left =j-1 (5-1) -> 4
//         right = 2*n-1-j (2*3-1-5) -> 0
//         smallestTopBottom=Math.min(top, bottom) = (0,4) -> 0
//         smallestLeftRight=Math.min(left, right) = (4,0) -> 0
//         smallest=Math.min(smallestTopBottom,smallestLeftRight) (0,0) -> 0
//         layer_no =smallest -> 0
//         print (n-layer_no) -> (3-0) -> 3
//         j++ (j=6) 

//   j =6 j<=total_cols (6<=5) -> false
// ------------------------------- End Inner Loop------------------------------
//   next line
//   i++ (i=2)
  
//    i =2 i<=total_rows (2<=5) -> true
//       j =1 j<=total_cols (2<=5) -> true
//         top= i-1 (2-1) -> 1
//         bottom = 2*n-1-i (2*3-1-2) -> 3
//         left =j-1 (1-1) -> 0
//         right = 2*n-1-j (2*3-1-1) -> 4
//         smallestTopBottom=Math.min(top, bottom) = (1,3) -> 1
//         smallestLeftRight=Math.min(left, right) = (0,4) -> 0
//         smallest=Math.min(smallestTopBottom,smallestLeftRight) (1,0) -> 0
//         layer_no =smallest -> 0
//         print (n-layer_no) -> (3-0) -> 3
//         j++ (j=2)
  
//     j =2 j<=total_cols (2<=5) -> true
//         top= i-1 (2-1) -> 1
//         bottom = 2*n-1-i (2*3-1-2) -> 3
//         left =j-1 (2-1) -> 1
//         right = 2*n-1-j (2*3-1-2) -> 3
//         smallestTopBottom=Math.min(top, bottom) = (1,3) -> 1
//         smallestLeftRight=Math.min(left, right) = (1,3) -> 1
//         smallest=Math.min(smallestTopBottom,smallestLeftRight) (1,1) -> 1
//         layer_no =smallest -> 1
//         print (n-layer_no) -> (3-1) -> 2
//         j++ (j=3)

//   j =3 j<=total_cols (3<=5) -> true
//         top= i-1 (2-1) -> 1
//         bottom = 2*n-1-i (2*3-1-2) -> 3
//         left =j-1 (3-1) -> 2
//         right = 2*n-1-j (2*3-1-3) -> 2
//         smallestTopBottom=Math.min(top, bottom) = (1,3) -> 1
//         smallestLeftRight=Math.min(left, right) = (2,2) -> 2
//         smallest=Math.min(smallestTopBottom,smallestLeftRight) (1,2) -> 1
//         layer_no =smallest -> 1
//         print (n-layer_no) -> (3-1) -> 2
//         j++ (j=4)

//   j =4 j<=total_cols (4<=5) -> true
//         top= i-1 (2-1) -> 1
//         bottom = 2*n-1-i (2*3-1-2) -> 3
//         left =j-1 (4-1) -> 3
//         right = 2*n-1-j (2*3-1-4) -> 1
//         smallestTopBottom=Math.min(top, bottom) = (1,3) -> 1
//         smallestLeftRight=Math.min(left, right) = (3,1) -> 1
//         smallest=Math.min(smallestTopBottom,smallestLeftRight) (1,1) -> 1
//         layer_no =smallest -> 1
//         print (n-layer_no) -> (3-1) -> 2
//         j++ (j=5)

//  j =5 j<=total_cols (5<=5) -> true
//         top= i-1 (2-1) -> 1
//         bottom = 2*n-1-i (2*3-1-2) -> 3
//         left =j-1 (5-1) -> 4
//         right = 2*n-1-j (2*3-1-5) -> 0
//         smallestTopBottom=Math.min(top, bottom) = (1,3) -> 1
//         smallestLeftRight=Math.min(left, right) = (4,0) -> 0
//         smallest=Math.min(smallestTopBottom,smallestLeftRight) (1,0) -> 0
//         layer_no =smallest -> 0
//         print (n-layer_no) -> (3-0) -> 3
//         j++ (j=6) 

//   j =6 j<=total_cols (6<=5) -> false
// ------------------------------- End Inner Loop------------------------------
//   next line
//   i++ (i=3)
  
//    i =3 i<=total_rows (3<=5) -> true
//       j =1 j<=total_cols (1<=5) -> true
//         top= i-1 (3-1) -> 2
//         bottom = 2*n-1-i (2*3-1-3) -> 2
//         left =j-1 (1-1) -> 0
//         right = 2*n-1-j (2*3-1-1) -> 4
//         smallestTopBottom=Math.min(top, bottom) = (2,2) -> 2
//         smallestLeftRight=Math.min(left, right) = (0,4) -> 0
//         smallest=Math.min(smallestTopBottom,smallestLeftRight) (2,0) -> 0
//         layer_no =smallest -> 0
//         print (n-layer_no) -> (3-0) -> 3
//         j++ (j=2)
  
//     j =2 j<=total_cols (2<=5) -> true
//         top= i-1 (3-1) -> 2
//         bottom = 2*n-1-i (2*3-1-3) -> 2
//         left =j-1 (2-1) -> 1
//         right = 2*n-1-j (2*3-1-2) -> 3
//         smallestTopBottom=Math.min(top, bottom) = (2,2) -> 2
//         smallestLeftRight=Math.min(left, right) = (1,3) -> 1
//         smallest=Math.min(smallestTopBottom,smallestLeftRight) (2,1) -> 1
//         layer_no =smallest -> 1
//         print (n-layer_no) -> (3-1) -> 2
//         j++ (j=3)

//   j =3 j<=total_cols (3<=5) -> true
//         top= i-1 (3-1) -> 2
//         bottom = 2*n-1-i (2*3-1-3) -> 2
//         left =j-1 (3-1) -> 2
//         right = 2*n-1-j (2*3-1-3) -> 2
//         smallestTopBottom=Math.min(top, bottom) = (2,2) -> 2
//         smallestLeftRight=Math.min(left, right) = (2,2) -> 2
//         smallest=Math.min(smallestTopBottom,smallestLeftRight) (2,2) -> 2
//         layer_no =smallest -> 2
//         print (n-layer_no) -> (3-2) -> 1
//         j++ (j=4)

//   j =4 j<=total_cols (4<=5) -> true
//         top= i-1 (3-1) -> 2
//         bottom = 2*n-1-i (2*3-1-3) -> 2
//         left =j-1 (4-1) -> 3
//         right = 2*n-1-j (2*3-1-4) -> 1
//         smallestTopBottom=Math.min(top, bottom) = (2,2) -> 2
//         smallestLeftRight=Math.min(left, right) = (3,1) -> 1
//         smallest=Math.min(smallestTopBottom,smallestLeftRight) (2,1) -> 1
//         layer_no =smallest -> 1
//         print (n-layer_no) -> (3-1) -> 2
//         j++ (j=5)

//  j =5 j<=total_cols (5<=5) -> true
//         top= i-1 (3-1) -> 2
//         bottom = 2*n-1-i (2*3-1-3) -> 2
//         left =j-1 (5-1) -> 4
//         right = 2*n-1-j (2*3-1-5) -> 0
//         smallestTopBottom=Math.min(top, bottom) = (2,2) -> 2
//         smallestLeftRight=Math.min(left, right) = (4,0) -> 0
//         smallest=Math.min(smallestTopBottom,smallestLeftRight) (2,0) -> 0
//         layer_no =smallest -> 0
//         print (n-layer_no) -> (3-0) -> 3
//         j++ (j=6) 

//   j =6 j<=total_cols (6<=5) -> false
// ------------------------------- End Inner Loop------------------------------
//   next line
//   i++ (i=4)


//   i =4 i<=total_rows (4<=5) -> true
//       j =1 j<=total_cols (1<=5) -> true
//         top= i-1 (4-1) -> 3
//         bottom = 2*n-1-i (2*3-1-4) -> 1
//         left =j-1 (1-1) -> 0
//         right = 2*n-1-j (2*3-1-1) -> 4
//         smallestTopBottom=Math.min(top, bottom) = (3,1) -> 1
//         smallestLeftRight=Math.min(left, right) = (0,4) -> 0
//         smallest=Math.min(smallestTopBottom,smallestLeftRight) (1,0) -> 0
//         layer_no =smallest -> 0
//         print (n-layer_no) -> (3-0) -> 3
//         j++ (j=2)
  
//     j =2 j<=total_cols (2<=5) -> true
//         top= i-1 (4-1) -> 3
//         bottom = 2*n-1-i (2*3-1-4) -> 1
//         left =j-1 (2-1) -> 1
//         right = 2*n-1-j (2*3-1-2) -> 3
//         smallestTopBottom=Math.min(top, bottom) = (3,1) -> 1
//         smallestLeftRight=Math.min(left, right) = (1,3) -> 1
//         smallest=Math.min(smallestTopBottom,smallestLeftRight) (1,1) -> 1
//         layer_no =smallest -> 1
//         print (n-layer_no) -> (3-1) -> 2
//         j++ (j=3)

//   j =3 j<=total_cols (3<=5) -> true
//          top= i-1 (4-1) -> 3
//         bottom = 2*n-1-i (2*3-1-4) -> 1
//         left =j-1 (3-1) -> 2
//         right = 2*n-1-j (2*3-1-3) -> 2
//         smallestTopBottom=Math.min(top, bottom) = (3,1) -> 1
//         smallestLeftRight=Math.min(left, right) = (2,2) -> 2
//         smallest=Math.min(smallestTopBottom,smallestLeftRight) (1,2) -> 1
//         layer_no =smallest -> 1
//         print (n-layer_no) -> (3-1) -> 2
//         j++ (j=4)

//   j =4 j<=total_cols (4<=5) -> true
//         top= i-1 (4-1) -> 3
//         bottom = 2*n-1-i (2*3-1-4) -> 1
//         left =j-1 (4-1) -> 3
//         right = 2*n-1-j (2*3-1-4) -> 1
//         smallestTopBottom=Math.min(top, bottom) = (3,1) -> 1
//         smallestLeftRight=Math.min(left, right) = (3,1) -> 1
//         smallest=Math.min(smallestTopBottom,smallestLeftRight) (1,1) -> 1
//         layer_no =smallest -> 1
//         print (n-layer_no) -> (3-1) -> 2
//         j++ (j=5)

//  j =5 j<=total_cols (5<=5) -> true
//          top= i-1 (4-1) -> 3
//         bottom = 2*n-1-i (2*3-1-4) -> 1
//         left =j-1 (5-1) -> 4
//         right = 2*n-1-j (2*3-1-5) -> 0
//         smallestTopBottom=Math.min(top, bottom) = (3,1) -> 1
//         smallestLeftRight=Math.min(left, right) = (4,0) -> 0
//         smallest=Math.min(smallestTopBottom,smallestLeftRight) (1,0) -> 0
//         layer_no =smallest -> 0
//         print (n-layer_no) -> (3-0) -> 3
//         j++ (j=6) 

//   j =6 j<=total_cols (6<=5) -> false
// ------------------------------- End Inner Loop------------------------------
//   next line
//   i++ (i=5)

 
//   i =5 i<=total_rows (5<=5) -> true
//       j =1 j<=total_cols (1<=5) -> true
//         top= i-1 (5-1) -> 4
//         bottom = 2*n-1-i (2*3-1-5) -> 0
//         left =j-1 (1-1) -> 0
//         right = 2*n-1-j (2*3-1-1) -> 4
//         smallestTopBottom=Math.min(top, bottom) = (4,0) -> 0
//         smallestLeftRight=Math.min(left, right) = (0,4) -> 0
//         smallest=Math.min(smallestTopBottom,smallestLeftRight) (0,0) -> 0
//         layer_no =smallest -> 0
//         print (n-layer_no) -> (3-0) -> 3
//         j++ (j=2)
  
//     j =2 j<=total_cols (2<=5) -> true
//         top= i-1 (5-1) -> 4
//         bottom = 2*n-1-i (2*3-1-5) -> 0
//         left =j-1 (2-1) -> 1
//         right = 2*n-1-j (2*3-1-2) -> 3
//         smallestTopBottom=Math.min(top, bottom) = (4,0) -> 0
//         smallestLeftRight=Math.min(left, right) = (1,3) -> 1
//         smallest=Math.min(smallestTopBottom,smallestLeftRight) (0,1) -> 0
//         layer_no =smallest -> 0
//         print (n-layer_no) -> (3-0) -> 3
//         j++ (j=3)

//   j =3 j<=total_cols (3<=5) -> true
//         top= i-1 (5-1) -> 4
//         bottom = 2*n-1-i (2*3-1-5) -> 0
//         left =j-1 (3-1) -> 2
//         right = 2*n-1-j (2*3-1-3) -> 2
//         smallestTopBottom=Math.min(top, bottom) = (4,0) -> 0
//         smallestLeftRight=Math.min(left, right) = (2,2) -> 2
//         smallest=Math.min(smallestTopBottom,smallestLeftRight) (0,2) -> 0
//         layer_no =smallest -> 0
//         print (n-layer_no) -> (3-0) -> 3
//         j++ (j=4)

//   j =4 j<=total_cols (4<=5) -> true
//         top= i-1 (5-1) -> 4
//         bottom = 2*n-1-i (2*3-1-5) -> 0
//         left =j-1 (4-1) -> 3
//         right = 2*n-1-j (2*3-1-4) -> 1
//         smallestTopBottom=Math.min(top, bottom) = (4,0) -> 0
//         smallestLeftRight=Math.min(left, right) = (3,1) -> 1
//         smallest=Math.min(smallestTopBottom,smallestLeftRight) (0,1) -> 0
//         layer_no =smallest -> 0
//         print (n-layer_no) -> (3-0) -> 3
//         j++ (j=5)

//  j =5 j<=total_cols (5<=5) -> true
//         top= i-1 (5-1) -> 4
//         bottom = 2*n-1-i (2*3-1-5) -> 0
//         left =j-1 (5-1) -> 4
//         right = 2*n-1-j (2*3-1-5) -> 0
//         smallestTopBottom=Math.min(top, bottom) = (4,0) -> 0
//         smallestLeftRight=Math.min(left, right) = (4,0) -> 0
//         smallest=Math.min(smallestTopBottom,smallestLeftRight) (0,0) -> 0
//         layer_no =smallest -> 0
//         print (n-layer_no) -> (3-0) -> 3
//         j++ (j=6) 

//   j =6 j<=total_cols (6<=5) -> false
// ------------------------------- End Inner Loop------------------------------
//   next line
//   i++ (i=6)
//   i<=5 (6<=5) -> false
// ------------------------------ End outer Loop------------------------------
// o/p:  
//  3 3 3 3 3
//  3 2 2 2 3
//  3 2 1 2 3
//  3 2 2 2 3
//  3 3 3 3 3

