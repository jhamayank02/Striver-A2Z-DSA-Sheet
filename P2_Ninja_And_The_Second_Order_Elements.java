import java.util.Arrays;

class P2_Ninja_And_The_Second_Order_Elements{

    public static int[] getSecondOrderElements(int n, int []arr) {

        // Bruteforce Approach -> Using sorting
        // Time complexity O(nlogn) || Space complexity O(1)
        // Arrays.sort(arr);

        // int ans[] = {arr[n-2], arr[1]};
        // return ans;



        // Better Approach -> In 2 pass
        // Time complexity O(n) || Space complexity O(1)
        // int largest = Integer.MIN_VALUE;
        // int smallest = Integer.MAX_VALUE;

        // for(int i=0;i<n;i++){
        //     if(largest < arr[i]){
        //         largest = arr[i];
        //     }
        //     if(smallest > arr[i]){
        //         smallest = arr[i];
        //     }
        // }

        // int secondLargest = Integer.MIN_VALUE;
        // int secondSmallest = Integer.MAX_VALUE;

        // for(int i=0;i<n;i++){
        //     if(secondLargest < arr[i] && arr[i] != largest){
        //         secondLargest = arr[i];
        //     }
        //     if(secondSmallest > arr[i] && arr[i] != smallest){
        //         secondSmallest = arr[i];
        //     }
        // }

        // int ans[] = {secondLargest, secondSmallest};
        // return ans;



        // Optimal Approach -> In 1 pass
        // Time complexity O(n) || Space complexity O(1)
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){

            if(largest < arr[i]){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(secondLargest < arr[i]){
                secondLargest = arr[i];
            }

            if(smallest > arr[i]){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(secondSmallest > arr[i]){
                secondSmallest = arr[i];
            }
        }

        int ans[] = {secondLargest, secondSmallest};
        return ans;
    }

    public static void main(String args[]){

    }
}