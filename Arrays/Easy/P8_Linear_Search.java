class P8_Linear_Search{

    public static int linearSearch(int n, int num, int []arr){
        // Time complexity O(n) || Space complexity O(1)
        for(int i=0; i<n; i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){

    }
}