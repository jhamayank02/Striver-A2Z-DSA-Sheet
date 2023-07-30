class P14_2_Traffic{

    public static int traffic(int n, int m, int []vehicle) {
        // Two pointer approach
        // Time complexity O(n) || Space complexity O(1)
        int left = 0;
        int right = 0;
        int temp_m = m;

        while(right < n){
            if(vehicle[right] == 0){
                temp_m--;
            }

            if(temp_m<0){
                if(vehicle[left] == 0){
                    temp_m++;
                }
                left++;
            }
            right++;
        }

        int maxLen = right - left;
        return maxLen;

    }

    public static void main(String args[]){

    }
}