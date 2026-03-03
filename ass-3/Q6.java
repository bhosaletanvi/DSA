public class CountDimond {
    public static void main(String[] args) {
        int count =1;
        for (int i = 1; i <=4; i++) {
            for (int j = 3; j>=i; j--) {
                System.out.print(" ");
            }
            for (int k =1; k <=i; k++) {
                System.out.print(" "+count);
                count++;
            }
            System.out.println();
        }

        for (int i = 3; i >=1; i--) {
            for (int j = i; j<=3; j++) {
                System.out.print(" ");
                
            }
            for (int k = 1; k <=i; k++){
                System.out.print(" "+count);
                count++;
            }
            System.out.println();
        }
        
    }
}
