import java.util.Scanner;
public class AmstrongNo {
        public static void main(String[] args) {
        int count=0;  
           
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number : "); 
       int n =sc.nextInt();
       int original=n; 
       int n2=n;
       while(n!=0){
        n=n/10;
        count++;
       }
       double sum=0; 
        while(n2!=0){
        int digit=n2%10;
        n2=n2/10;
       sum =sum+(Math.pow(digit,count));
       }
       if(original==sum){
        System.out.println("Amstrong Number ");
       }
       else{
        System.out.println("not Amstrong Number ");

       }
    }
}
    

// --------------------- DRY RUN ------------------------------
//   count =0 
//   n=153
// original= n -> 153
// n2 =n -> 153
//   while (n!=0) (153 !=0) -> true
//     n=n/10 (153/10) ->15
//     count ++ (0+1) -> 1

//  while (n!=0) (32 !=0) -> true
//     n=n/10 (15/10) ->1
//     count ++ (1+1) -> 2  

//  while (n!=0) (3 !=0) -> true
//     n=n/10 (1/10) ->0
//     count ++ (2+1) -> 3

//  while (n!=0) (0!=0) -> False 
  
// --------------- End while loop -------------------------------
  
        // sum=0
//   while (n2!=0) (153 !=0) -> true
//         digit=n2%10 -> (153 % 10) -> 3
//         n2=n2/10 -> (153/10) -> 15
//         sum=sum+ Math.pow(digit,count) -> (0+27) -> 27        

//   while (n2!=0) (15 !=0) -> true
//         digit=n2%10 -> (15 % 10) -> 5
//         n2=n2/10 -> (15/10) -> 1
//         sum=sum+ Math.pow(digit,count) -> (27+125) -> 152  

//   while (n2!=0) (15 !=0) -> true
//         digit=n2%10 -> (1 % 10) -> 1
//         n2=n2/10 -> (1/10) -> 0
//         sum=sum+ Math.pow(digit,count) -> (152+1) -> 153

//  while (n2!=0) (0!=0) -> False 

// -------------------End 2ns while loop ------------------------
   // if (oroginal == sum)
   //    (153==153) -> true
   //         print  amstrong Number 
//   o/p :

// Enter Number : 153
// Amstrong Number

// Enter Number : 162
// not Amstrong Number
  
  
