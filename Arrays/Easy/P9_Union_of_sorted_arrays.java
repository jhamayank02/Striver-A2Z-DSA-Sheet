import java.util.*;

class P9_Union_of_sorted_arrays{

    public static List< Integer > sortedArray(int []a, int []b) {

        // Using ordered set
        // Time complexity O((n+m)log(n+m)) || Space complexity O(n+m)
        
        // int n = a.length;
        // int m = b.length;
        // TreeSet<Integer> set = new TreeSet<>();

        // for(int i=0; i<n; i++){
        //     set.add(a[i]);
        // }
        
        // for(int i=0; i<m; i++){
        //     set.add(b[i]);
        // }

        // List<Integer> union = new ArrayList<>();

        // for(int elem : set){
        //     union.add(elem);
        // }
        // return union;




        // Using 2 pointers
        // Time complexity O(n+m) || Space complexity O(n+m)
        List<Integer> ans = new ArrayList<>();

         int n = a.length;
         int m = b.length;
         int i = 0;
         int j = 0;

         while(i<n && j<m){
             if(a[i] < b[j]){
                 ans.add(a[i]);
                 i++;
             }
             else if(a[i] > b[j]){
                 ans.add(b[j]);
                 j++;
             }
             else{
                 ans.add(a[i]);
                 i++;
                 j++;
             }
         }

         while(i<n){
             ans.add(a[i]);
             i++;
         }

         while(j<m){
             ans.add(b[j]);
             j++;
         }

         // Remove duplicates
         for(int k=0; k<ans.size()-1; k++){
             if(ans.get(k) == ans.get(k+1)){
                 ans.remove(k);
                 k -= 1;
             }
         }

         return ans;
    }

    public static void main(String args[]){

    }
}