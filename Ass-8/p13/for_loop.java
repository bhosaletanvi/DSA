// Q13. Replace Elements with Frequency
// 👉 Convert:
// [1,2,2,3]
// → [1,2,2,1]
import java.util.Scanner;
class demo{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter array Size :");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter array elements : ");
        for (int i = 0; i <arr.length; i++) {
        arr[i]=sc.nextInt();
        } 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
            
        }
        for(int i=0;i<arr.length;i++){
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            arr[i]=count;
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
            
        }
    }
}