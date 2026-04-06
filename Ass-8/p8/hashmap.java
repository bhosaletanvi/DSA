import java.util.HashMap;
import java.util.Scanner;

class hashmap {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0)+1);
        }
        boolean flag = true;
        for (Character key : hm.keySet()) {
            if (hm.get(key) == 0) {
                flag = false;
                break;
            }
        }

        System.out.println(flag);
    }
}