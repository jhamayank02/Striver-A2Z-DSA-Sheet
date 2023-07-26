class P5_Left_Rotate_an_Array_by_One{

    public static void swap(int i, int j, int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] rotateArray(int[] arr, int n) {

        // Bruteforce approach -> Using an auxiliary array
        // Time complexity O(n) || Space complexity O(n)
        // int ans[] = new int[n];
        // for(int i=1; i<n; i++){
        //     ans[i-1] = arr[i];
        // }
        // ans[n-1] = arr[0];
        // return ans;


        // Using 2 pointers approach
        // Time complexity O(n) || Space complexity O(1)
        // int i = 0;
        // int j = 1;

        // while(j<n){
        //     swap(i, j, arr);
        //     i++;
        //     j++;
        // }

        // return arr;


        // Optimal approach -> Store the first element in a temp variable and shift all elements to one position left -> arr[i-1] = arr[i] and at end add the temp variable in arr[n-1]
        // Time complexity O(n) || Space complexity O(1)
        int temp = arr[0];
        for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        return arr;
    }

    public static void main(String args[]){

    }
}