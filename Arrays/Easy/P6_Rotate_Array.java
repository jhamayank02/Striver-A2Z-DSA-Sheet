class P6_Rotate_Array{

    
    public static void reverse(int i, int j, int arr[]){
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public void rotate(int[] nums, int k) {

        // Bruteforce approach
        // Time complexity O(n*k) || Space complexity O(1)
        // int n = nums.length;
        // for(int i=1; i<=k; i++){
        //     int temp = nums[n-1];

        //     for(int j=n-1; j>0; j--){
        //         nums[j] = nums[j-1];
        //     }
        //     nums[0] = temp;
        // }



        // Using an auxiliary array
        // Time complexity O(n) || Space complexity O(n)
        // int n = nums.length;
        // int temp[] = new int[n];
        // for(int i=0; i<n; i++){
        //     temp[i] = nums[i];
        // }

        // for(int i=0; i<n; i++){
        //     int ind = (i+k) % n;
        //     nums[ind] = temp[i];
        // }



        // Optimal approach -> Using reversal algorithm
        // Time complexity O(n) || Space complexity O(1)
        int n = nums.length;

        // Ensure that k is within array bounds
        k = k % n;

        // Reverse the first n-k elements
        reverse(0, n-k-1, nums);

        // Reverse the last k elements
        reverse(n-k, n-1, nums);

        // Reverse the whole array
        reverse(0, n-1, nums);
    }

    public static void main(String args[]){

    }
}