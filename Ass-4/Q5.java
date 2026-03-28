import java.util.Scanner;
public class NCross {
    void main(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if(i==j || i+j==(n+1)){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}

// ------------------DRY RUn for n=3--------------------
// i=1 i<=n  (1<=3) -> true
//     j=1 j<=n (1<=3) -> true
//         if(i==j || i+j==(n+1))
//         if(1==1 || 1+1==(3+1)) --->   (2==4)  
//         if(true || false) -> true
//            print *                                   o/p : *
//         j++ (j=2)
//     j=2 j<=n (2<=3) -> true
//         if(i==j || i+j==(n+1))
//         if(1==2 || 1+2==(3+1)) --->   (3==4)  
//         if(false || false) -> true
//            print -                                   o/p : * -
//         j++ (j=2)
//     j=3 j<=n (3<=3) -> true
//         if(i==j || i+j==(n+1))
//         if(1==3 || 1+3==(3+1)) --->   (4==4)  
    //     if(false || true) -> true
    //        print *                                   o/p : * - *
    //     j++ (j=4) 
    // j=4 j<=n (4<=3) -> false 
    // ---------------end inner loop -----------------------
    // next line 
    // i++ (i=2)

    
    // i=2 i<=n  (2<=3) -> true
    // j=1 j<=n (1<=3) -> true
    //     if(i==j || i+j==(n+1))
    //     if(2==1 || 2+1==(3+1)) --->   (3==4)  
    //     if(false || false) -> false
    //        print _                                   o/p : * - *
    //     j++ (j=2)                                          -          
    // j=2 j<=n (2<=3) -> true
    //     if(i==j || i+j==(n+1))
    //     if(2==2 || 2+2==(3+1)) --->   (4==4)  
    //     if(true || true) -> true
    //        print *                                   o/p : * - *
    //     j++ (j=2)                                          - *                              
    // j=3 j<=n (3<=3) -> true
    //     if(i==j || i+j==(n+1))
    //     if(2==3 || 2+3==(3+1)) --->   (5==4)  
    //     if(false || false) -> false
    //        print _                                   o/p : * - *
    //     j++ (j=4)                                          - * -       
    // j=4 j<=n (4<=3) -> false 
    // ---------------end inner loop -----------------------
    // next line 
    // i++ (i=3)


    // i=3 i<=n  (3<=3) -> true
    // j=1 j<=n (1<=3) -> true
    //     if(i==j || i+j==(n+1))
    //     if(3==1 || 3+1==(3+1)) --->   (4==4)  
    //     if(true || true) -> true
    //        print *                                   o/p : * - *
    //     j++ (j=2)                                          - * -  
    // j=2 j<=n (2<=3) -> true                                *    
    //     if(i==j || i+j==(n+1))
    //     if(3==2 || 3+2==(3+1)) --->   (5==4)  
    //     if(false || false) -> false
    //        print -                                   o/p : * - *
    //     j++ (j=2)                                          - * -  
    // j=3 j<=n (3<=3) -> true                                * -    
    //     if(i==j || i+j==(n+1))
    //     if(3==3 || 3+3==(3+1)) --->   (6==4)  
    //     if(true || true) -> true
    //        print *                                   o/p : * - *
    //     j++ (j=4)                                          - * -   
    // j=4 j<=n (4<=3) -> false                               * - *      
    // ---------------end inner loop -----------------------
    // next line 
    // i++ (i=4)
    // i=4 i<=3 (4<=3) -> false 
    // ------------ end outer loop --------------------------
    
