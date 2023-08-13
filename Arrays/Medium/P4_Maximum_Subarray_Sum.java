class P4_Maximum_Subarray_Sum{

    public static long maxSubarraySum(int[] arr, int n) {
        
        // Using three loops
        // T.C O(n^3) || S.C O(1)
		// int maxSum = Integer.MIN_VALUE;

		// for(int i=0; i<n; i++){
		// 	for(int j=i; j<n; j++){

		// 		int sum = 0;
		// 		for(int k=i; k<=j; k++){
		// 			sum += arr[k];
		// 		}
				
		// 		if(sum > maxSum){
		// 			maxSum = sum;
		// 		}
		// 	}
		// }

		// // 0 means empty subarray
		// if(maxSum < 0){
		// 	return 0;
		// }

		// return maxSum;



        
        // Using two loops
        // T.C O(n^2) || S.C O(1)
		// long maxSum = Integer.MIN_VALUE;

		// for(int i=0; i<n; i++){
		// 	long sum = 0;
		// 	for(int j=i; j<n; j++){
		// 		sum += arr[j];
					
		// 		if(sum > maxSum){
		// 			maxSum = sum;
		// 		}
		// 	}
		// }

		// // 0 means empty subarray
		// if(maxSum < 0){
		// 	return 0;
		// }

		// return maxSum;


        // Using one loop
        // T.C O(n) || S.C O(1)
		long maxSum = 0;
		long sum = 0;

		for(int i=0; i<n; i++){
			sum += arr[i];

			if(sum < 0){
				sum = 0;
			}
			if(sum > maxSum){
				maxSum = sum;
			}
		}

		return maxSum;
	}

    public static void main(String args[]){

    }
}