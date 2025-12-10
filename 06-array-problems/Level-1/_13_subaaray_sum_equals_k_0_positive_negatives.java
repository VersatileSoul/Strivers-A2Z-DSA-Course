void main() {
    int[] arr = {1, 2, -3, 3, 1, -1, 2, -2};
    int k = 3;
    int subArray = subarraySum(arr,k);
    IO.println(subArray);
}

public int subarraySum(int[] nums, int K) {
//    int maxSubArray = 0;
//    for(int i = 0; i < nums.length; i++) {
//        int tempSum = 0;
//        for(int j = i; j < nums.length; j++) {
//            tempSum += nums[j];
//            if(tempSum == sum) {
//                maxSubArray = Math.max(maxSubArray,j-i+1);
//            }
//        }
//    }
//    return maxSubArray;
    HashMap<Integer, Integer> mp = new HashMap<>();

    mp.put(0,-1);
    int longest = 0;
    int sum = 0, check;
    for(int i = 0; i < nums.length; i++) {
        sum += nums[i];
        check = sum - K;
        if(mp.containsKey(check)) {
            int len = i - mp.get(check);
            longest = Math.max(longest,len);
        }
        mp.putIfAbsent(sum,i);
    }

    return longest;
}
