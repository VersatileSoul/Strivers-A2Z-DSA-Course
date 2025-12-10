void main() {
    int[] arr = {-3, -2, -1};
    int ans = maxSubArray(arr);
    IO.println(ans);
}

public int maxSubArray(int[] arr) {
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;
    int start = 0; int end = 0; int tempStart = 0;
    for(int i=0; i < arr.length; i++) {
        currSum += arr[i];
        if(currSum > maxSum) {
            start = tempStart;
            end = i;
            maxSum = currSum;
        }
        if(currSum < 0) {
            currSum = 0;
            tempStart = i+1;
        }
    }
    for(int i = start; i <= end; i++) {
        IO.println(arr[i]);
    }
    return maxSum;
}