// Q13. Replace Elements with Frequency
// 👉 Convert:
// [1,2,2,3]
// → [1,2,2,1]
import java.util.HashMap;
import java.util.Scanner;

 class demo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter array Size :");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter array elements : ");
        for (int i = 0; i <arr.length; i++) {
        arr[i]=sc.nextInt();
        } 
        for (int i = 0; i <arr.length; i++) {
        System.out.print(" "+arr[i]);
        } 
        HashMap<Integer,Integer> hm =new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
       
        System.out.println();
        for(Integer key : hm.keySet()){
            if(hm.get(key)>=1){
                System.out.print(" "+hm.get(key));
            }
        }
    }
}
