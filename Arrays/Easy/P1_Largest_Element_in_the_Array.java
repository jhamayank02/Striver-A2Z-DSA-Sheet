class P1_Largest_Element_in_the_Array{

    // Time complexity O(n) || Space complexity O(1)
    static int largestElement(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(maxi < arr[i]){
                maxi = arr[i];
            }
        }
        return maxi;
    }

    public static void main(String args[]){

    }
}