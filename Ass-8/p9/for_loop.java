// Q9. Find Missing Elements Between Two Arrays
// Elements present in arr1 but missing in arr2
// Example:
// arr1 = [1,1,2,2,2,3,7] arr2 = [1,1,2,2,2,3]
// → Output: 7
import java.util.Scanner;
class demo{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter 1st array Size :");
        int size1=sc.nextInt();
        int[] arr1=new int[size1];
        System.out.print("Enter array elements : ");
        for (int i = 0; i <arr1.length; i++) {
        arr1[i]=sc.nextInt();
        } 
        System.out.print("Enter 2nd array Size :");
        int size2=sc.nextInt();
        int[] arr2=new int[size2];
        System.out.print("Enter array elements : ");
        for (int i = 0; i <arr2.length; i++) {
        arr2[i]=sc.nextInt();
        } 
        for(int i=0;i<arr1.length;i++){
            int count=0;
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j]){
                    count++;
                }
            }
            if(count==0){
                System.out.print(" "+arr1[i]);
            }
        }
    }
}