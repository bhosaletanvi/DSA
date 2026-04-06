import java.util.Scanner;
class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        boolean flag = true;
        int[] freq = new int[26];
         for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
