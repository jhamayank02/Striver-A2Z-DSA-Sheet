class P12_Find_The_Single_Element{

    public static int getSingleElement(int []arr){
        // Using two pointers approach
        // Time complexity O(n) || Space complexity O(1)
        // int n = arr.length;
        // int i = 0;
        // int j = 1;

        // while(j<n){
        //     if(arr[i] != arr[j]){
        //         return arr[i];
        //     }
        //     else{
        //         i += 2;
        //         j += 2;
        //     }
        // }

        // return arr[i];


        // Using XOR operation
        // Time complexity O(n) || Space complexity O(1)
        int n = arr.length;
        int xor = 0;
        
        for(int i=0; i<n; i++){
            xor ^= arr[i];
        }

        return xor;
    }

    public static void main(String args[]){

    }
}