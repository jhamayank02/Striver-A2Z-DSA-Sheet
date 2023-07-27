import java.util.Arrays;

class P10_Missing_Number{

    public int missingNumber(int[] nums) {
        // Bruteforce approach -> Using an auxiliary array
        // Time complexity O(n) || Space complexity O(n)
        // int n = nums.length;
        // boolean visited[] = new boolean[n+1];

        // for(int i=0; i<n; i++){
        //     visited[nums[i]] = true;
        // }
        // for(int i=0; i<n+1; i++){
        //     if(visited[i] == false){
        //         return i;
        //     }
        // }

        // return -1;



        // Using sorting
        // Time complexity O(nlogn) || Space complexity O(1)
        // int n = nums.length;
        // Arrays.sort(nums);

        // int missingNum = 0;
        // for(int i=0; i<n; i++){
        //     if(nums[i] != missingNum){
        //         return missingNum;
        //     }
        //     missingNum++;
        // }

        // return missingNum;



        // Optimal approach -> Using Summation Approach
        // Time complexity O(n) || Space complexity O(1)
        // int n = nums.length;
        // int s1 = (n * (n+1)) / 2;
        // int s2 = 0;

        // for(int i=0; i<n; i++){
        //     s2 += nums[i];
        // }

        // return s1-s2;


        
        // Optimal approach -> Using XOR Approach
        // Time complexity O(n) || Space complexity O(1)
        int n = nums.length;
        int XOR1 = 0; // XOR of all the numbers from 0 to n
        int XOR2 = 0; // XOR of all the numbers except the missing number

        for(int i=0; i<=n; i++){
            XOR1 ^= i;
        }
        for(int i=0; i<n; i++){
            XOR2 ^= nums[i];
        }

        int missingNum = XOR1 ^ XOR2;
        return missingNum;
    }

    public static void main(String args[]){

    }
}