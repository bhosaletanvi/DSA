class Sum {
    public static void main(String[] args) {
        int[] arr = {12,34,5};
        int ans = f(arr, 0);
        System.out.println(ans);
    }

    static int f(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        }

        int right = f(arr, index + 1);

        while (arr[index] != 0) {
            int digit = arr[index] % 10;
            right = right + digit;
            arr[index] = arr[index] / 10;
        }

        return right;
    }
}