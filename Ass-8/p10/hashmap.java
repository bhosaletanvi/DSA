// Q10. Find Common Elements (With Frequency)
// Intersection of two arrays
// Example:
// [1,2,2,3] & [2,2,4]
// → Output: [2,2]
import java.util.HashMap;
import java.util.Scanner;

 class demo{
    public static void main(String[] args) {
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
        HashMap<Integer,Integer> hm1 =new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            hm1.put(arr1[i],hm1.getOrDefault(arr1[i],0)+1);
        }
        HashMap<Integer,Integer> hm2 =new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            hm2.put(arr2[i],hm2.getOrDefault(arr2[i],0)+1);
        }
        for(Integer key : hm1.keySet()){
            if(hm2.containsKey(key)){
                System.out.println(key+" -> "+hm1.get(key));
            }
        }
    }
}
