import java.util.*;

class P3_Majority_Element{

    
    public static int majorityElement(int []v) {
        
        // Using hashmap
        // T.C O(n) || S.C O(n)
        // int n = v.length;

        // // Edge case
        // if(n==1){
        //     return v[0];
        // }

        // HashMap<Integer, Integer> map = new HashMap<>();
        // int majorityElement = -1;

        // for(int i=0; i<n; i++){
        //     int elem = v[i];

        //     if(map.containsKey(elem)){
        //         int cnt = map.get(elem) + 1;
        //         if(cnt>n/2){
        //             majorityElement = elem;
        //             return majorityElement;
        //         }
        //         map.put(elem, cnt);
        //     }
        //     else{
        //         map.put(elem, 1);
        //     }
        // }

        // return majorityElement;



        // Moore's voting algorithm
        // T.C O(n) || S.C O(1)
        int n = v.length;
        int cnt = 0;
        int elem = 0;

        for(int i=0; i<n; i++){
            if(cnt == 0){
                elem = v[i];
                cnt=1;
            }
            else if(elem != v[i]){
                cnt--;
            }
            else{
                cnt++;
            }
        }

        return elem;
    }


    public static void main(String args[]){

    }
}