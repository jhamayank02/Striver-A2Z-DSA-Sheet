class P7_Move_Zeroes_to_End{

    public static int[] moveZeros(int n, int []arr) {

        // Using an auxiliary array
        // Time complexity O(n) || Space complexity O(n)

        // int ans[] = new int[n];
        // int zeroCnt = 0;
        // int ind = 0;

        // for(int i=0;i<n;i++){
        //     if(arr[i] == 0){
        //         zeroCnt++;
        //     }
        //     else{
        //         ans[ind] = arr[i];
        //         ind++;
        //     }
        // }

        // while(zeroCnt > 0){
        //     ans[ind] = 0;
        //     zeroCnt--;
        //     ind++;
        // }

        // return ans;




        // Using two pointers approach
        // Time complexity O(n) || Space complexity O(1)

        int i = 0; // i will track 0
        int j = 1; // j will track non zero elements

        while(j < n){

            if(arr[i] == 0 && arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
            else if(arr[i] == 0 && arr[j] == 0){
                j++;
            }
            else{
                i++;
                j++;
            }

        }

        return arr;
    }


    public static void main(String args[]){

    }
}