import java.util.*;
public class p2 {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int [] arr = new int [size];
        System.out.print("Enter Elemets : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter Target  : ");
        int target = sc.nextInt();
        int ans = f(arr,target,0);
        System.out.println("first Occurance at : "+ans);
    }   
    static int f(int [] arr, int target , int index){
        if(index==arr.length-1){
            return -1;
        }
        int right =f(arr,target,index+1);
        if(right!=-1){
            return right;
        }
        if(arr[index]==target){
            return index;
        }
        return -1;
    }
}
