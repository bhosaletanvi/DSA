// 9. Sum of Elements at Odd Index
// 👉 Return sum of elements at index 1,3,5...
// Input: [10,20,30,40,50]
// Output: 20 + 40 = 60
import java.util.*;
 class Sum_of_odd_index{
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int [] arr = new int [size];
        System.out.print("Enter Elemets : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int ans=f(arr,0);
        System.out.println(ans);
    }   
    static int  f(int [] arr, int index){
      if(index==arr.length-1){
        if(index%2!=0){
            return arr[index];
        }
        return 0;
      }
      int right=f(arr, index+1);
      if(index%2!=0){
        return arr[index]+right;
      }
      return right;
    }
}

