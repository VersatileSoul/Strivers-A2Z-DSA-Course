void main() {
    int[] arr = {1, 2, 3, 3, 1, 1, 1, 6};
    int k = 6;
    int subArray = subarraySum(arr,k);
    IO.println(subArray);
}
public static int subarraySum(int[] arr, int k) {
    int left = 0; int sum = 0;
    int maxSubArray = 0;
    for(int i = 0; i < arr.length; i++) {
        sum+= arr[i];
        while(sum > k) {
            sum -= arr[left++];
        }
            if(sum==k) {
                maxSubArray = Math.max(maxSubArray,i-left+1);
            }
    }
    return maxSubArray;
}