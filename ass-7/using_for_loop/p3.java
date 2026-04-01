// Q3. Count Occurrences
// 👉 Count how many times target appears
// Input: [1,2,2,3,2], target = 2
// Output: 3
import java.util.*;
class target{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    System.out.print("Enter array Size :");
    int size=sc.nextInt();
    int[] arr=new int[size];
    System.out.print("Enter array elements : ");
    for (int i = 0; i <arr.length; i++) {
        arr[i]=sc.nextInt();
    } 
     System.out.print("Enter number  :");
    int n=sc.nextInt();  
    int count=0;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]==n){
            count++;
        }
    }
    System.out.println("target occurs for "+count+" times .");
    }
    
}
