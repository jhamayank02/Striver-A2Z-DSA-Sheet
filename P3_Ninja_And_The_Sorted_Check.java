class P3_Ninja_And_The_Sorted_Check{
    public static int isSorted(int n, int []arr) {
        
        // Optimal Approach
        // Time complexity O(n) || Space complexity O(1)
        for(int i=1; i<n; i++){
            if(arr[i] < arr[i-1]){
                return 0;
            }
        }

        return 1;
    }

    public static void main(String args[]){

    }
}