import java.util.Scanner;
public class All_prime_no {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n= sc.nextInt();
        int value=0;
        for (int i = 2; i <=n; i++) {
            value=0;
            for (int j =2 ; j <=i; j++) {
                if(i%j==0){
                 value=j;
                 break;
                }

        }
        if(value==i){
            System.out.print(" "+value);
          }
        
    }
    // System.err.println("hello");
    
}
}

