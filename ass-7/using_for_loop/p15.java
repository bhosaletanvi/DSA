import java.util.*;
class Negative_sum{
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter array Size :");
    int size=sc.nextInt();
    int[] arr=new int[size];
    System.out.print("Enter array elements : ");
    for (int i = 0; i <arr.length; i++) {
        arr[i]=sc.nextInt();
    } 
    int sum=0;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]<0){
            sum=sum+arr[i];
        }
    }
    System.out.print("Sum Of negative Element : "+sum);
    }
    
}