import java.util.*;

class P13_Longest_Subarray_With_Sum_K{

    public static int longestSubarrayWithSumK(int []a, long k) {

        // Bruteforce approach
        // Time complexity O(n^3) || Space complexity O(1)
        // int n = a.length;
        // int maxLen = 0;
        // for(int i=0; i<n; i++){
        //     for(int j=i; j<n; j++){
        //         long sum = 0;

        //         for(int m=i; m<=j; m++){
        //             sum += a[m];
        //         }
        //         if(sum == k){
        //             maxLen = Math.max(maxLen, j-i+1);
        //         }
        //     }
        // }
        // return maxLen;


        

        // Bruteforce approach
        // Time complexity O(n^2) || Space complexity O(1)
        // int n = a.length;
        // int maxLen = 0;
        // for(int i=0; i<n; i++){
        //     int sum = 0;
        //     for(int j=i; j<n; j++){

        //         sum += a[j];
        //         if(sum == k){
        //             maxLen = Math.max(maxLen, j-i+1);
        //         }
        //     }
        // }
        // return maxLen;



        // Using Map (Works for zeroes, positives and negatives)
        // Time complexity O(nlogn) || Space complexity O(n)
        // HashMap<Long, Integer> prefixSumMap = new HashMap<>();
        // int n = a.length;
        // long sum = 0;
        // int maxLen = 0;

        // for(int i=0; i<n; i++){
        //     sum += a[i];

        //     if(sum == k){
        //         maxLen = Math.max(maxLen, i+1);
        //     }

        //     long remaining = sum - k;
        //     if(prefixSumMap.containsKey(remaining)){
        //         int len = i - prefixSumMap.get(remaining);
        //         maxLen = Math.max(maxLen, len);
        //     }
        //     // It will make the code to work for array if it have zeroes and negatives
        //     if(!prefixSumMap.containsKey(sum)){
        //         prefixSumMap.put(sum, i);
        //     }
        // }

        // return maxLen;



        // Optimal approach -> Two pointers approach (Only works for zeroes and positives)
        // Time complexity O(2n) ~= O(n) || Space complexity O(1)
        int i = 0;
        int j = 0;
        int n = a.length;

        long sum = a[0];
        int maxLen = 0;

        while(j<n){
            
            while(i<=j && sum>k){
                sum -= a[i];
                i++;
            }

            if(sum == k){
                int len = j-i+1;
                maxLen = Math.max(maxLen, len);
            }

            j++;
            if(j<n){
                sum += a[j];
            }
        }

        return maxLen;
    }

    public static void main(String args[]){

    }
}