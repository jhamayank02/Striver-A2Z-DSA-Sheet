import java.util.*;

class P2_Sort_An_Array_of_0s_1s_and_2s{

    public static void swap(int a, int b, ArrayList<Integer> arr){
        int temp = arr.get(a);
        arr.set(a, arr.get(b));
        arr.set(b, temp);
    }
    public static void sortArray(ArrayList<Integer> arr, int n) {
        // By keeping track of number of 0s, 1s and 2s
        // Time complexity O(n) || Space complexity O(1)
        
        // int zeroCount = 0;
        // int oneCount = 0;
        // int twoCount = 0;

        // for(int i=0; i<n; i++){
        //     switch(arr.get(i)){
        //         case 0:
        //             zeroCount++;
        //             break;
        //         case 1:
        //             oneCount++;
        //             break;
        //         case 2:
        //             twoCount++;
        //             break;
        //     }
        // }

        // int ind = 0;
        // while(zeroCount > 0){
        //     arr.set(ind, 0);
        //     zeroCount--;
        //     ind++;
        // }
        // while(oneCount > 0){
        //     arr.set(ind, 1);
        //     oneCount--;
        //     ind++;
        // }
        // while(twoCount > 0){
        //     arr.set(ind, 2);
        //     twoCount--;
        //     ind++;
        // }



        // Using 3 pointers
        // Time complexity O(n) || Space complexity O(1)
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid<=high){
            if(arr.get(mid)==0){
                swap(low, mid, arr);
                low++;
                mid++;
            }
            else if(arr.get(mid)==1){
                mid++;
            }
            else{
                swap(mid, high, arr);
                high--;
            }
        }
    }

    public static void main(String args[]){

    }
}