// Check if all elements are unique
// Input: {1, 2, 3, 4}
// Output: true

class UniqueArray {
    public static void main(String[] args) {
        
        int[] arr = {1,1,3,4};
        int max = 0;

        // Find maximum element
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        // Create frequency array
        int[] freq = new int[max + 1];

        // Count frequency
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        // Check if all elements are unique
        boolean flag = false;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i]<=1) {
                flag = true;
            }
            else{
                flag=false;
                break;
            }
        }

        System.out.println(flag);
    }
}