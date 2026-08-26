import java.util.*;

class demo{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of strings: ");
    int n = sc.nextInt();
    sc.nextLine();   // Important

    String[] arr = new String[n];

    System.out.println("Enter the strings:");
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.next();
    }

    List<List<String>> result = groupAnagrams(arr);
    System.out.println(result);
}

static List<List<String>> groupAnagrams(String[] arr) {
        ArrayList<Integer> al= new ArrayList<>(); 
	HashMap<String , Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int sum=0;
            String temp=arr[i];
            for(int j=0;j<temp.length();j++){
                sum+=temp.charAt(j);
		
            }
            hm.put(arr[i],sum);
            sum=0;
        }
	System.out.println(hm);
        List<String> str = new ArrayList<>();
        List<List<String>> fnl = new ArrayList<>();
        for(Integer value : new ArrayList<>(hm.values())){
            int temp=value;
	    System.out.println(temp);
            ArrayList<String> removeKeys = new ArrayList<>();

for (String key : hm.keySet()) {
    if (temp == hm.get(key)) {
        str.add(key);
        removeKeys.add(key);
    }
}

for (String key : removeKeys) {
    hm.remove(key);
}
	    System.out.println(str);
            if (!str.isEmpty()) {
    fnl.add(new ArrayList<>(str));
}
str.clear();
        }
        return fnl;
    }
}