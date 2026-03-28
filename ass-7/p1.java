import java.util.Scanner;
class p1{
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
        static int f(int [] arr , int target , int index){
            if(arr[index]==target){
                return index;
            }
            if(index == arr.length-1){
                System.out.println("Element not found ");
                return -1;
            }
            return   f(arr,target,index+1);

    }
}