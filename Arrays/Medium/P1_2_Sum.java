import java.util.*;

class P1_2_Sum{

    public static String read(int n, int []book, int target){

        // Approach 1 : Bruteforce approach -> Using 2 loops
        // Time complexity O(n^2) || Space complexity O(1)

        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(book[i] + book[j] == target){
        //             return "YES";
        //         }
        //     }
        // }
        // return "NO";




        // Approach 2 : Using Hashmap
        // Time complexity O(n) || Space complexity O(n)

        // HashMap<Integer, Boolean> map = new HashMap<>();

        // for(int i=0; i<n; i++){
        //     int reqNum = target-book[i];
        //     if(reqNum > 0 && map.containsKey(reqNum)){
        //         return "YES";
        //     }
        //     else{
        //         map.put(book[i], true);
        //     }
        // }
        // return "NO";




        // Approach 3 : Two pointers approach
        // Time complexity O(n*logn) || Space complexity O(1)

        Arrays.sort(book);

        int left = 0;
        int right = n-1;

        while(left<right){
            if(book[left]+book[right] == target){
                return "YES";
            }
            else if(book[left]+book[right] < target){
                left++;
            }
            else{
                right--;
            }
        }

        return "NO";
        
    }

    public static void main(String args[]){

    }
}