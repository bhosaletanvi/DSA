class divisible_by_k {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,9};
        int k =2;
        int ans=f(arr,k,0);
        System.out.println(ans);
    }
    // static int count=0;
    static int f(int[] arr,int k ,int index){
        if(index>=arr.length){
            return 0;
        }
        int right=f(arr, k, index+1);
        if(arr[index]%k==0){
            return ++right;
        }
        return right;
    }
}
