import java.util.ArrayList;

class P4_Remove_Duplicates_from_Sorted_Array{

    // Using 2 pointers
    // Time complexity O(n) || Space complexity O(1)
    public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// int duplicates = 0;

		// for(int i=0; i<n-1; i++){
		// 	if(arr.get(i) == arr.get(i+1)){
		// 		duplicates++;
		// 	}
		// }

		// return n-duplicates;

		int i = 0;
		for(int j=1; j<n; j++){
			if(arr.get(i) != arr.get(j)){
				i++;
				arr.set(i, arr.get(j));
			}
		}

		return i+1;
	}

    public static void main(String args[]){

    }
}