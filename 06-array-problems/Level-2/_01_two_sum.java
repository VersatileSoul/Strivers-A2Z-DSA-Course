void main() {
    int[] arr = {3,2,4};
    int target = 6;

    int[] ans = twoSum(arr,target);
    for(int i : ans) IO.print(i);
    IO.println();
}

public static int[] twoSum(int[] nums, int target) {
    int[] ans = new int[2];
//    for(int i = 0; i < nums.length; i++) {
//        int temp = target - nums[i];
//        ans[0] = i;
//        for(int j = 0; j < nums.length; j++) {
//            if(temp==nums[j] && i != j) {
//                ans[1] = j;
//                return ans;
//            }
//        }
//    }

    HashMap<Integer,Integer> mp = new HashMap<>();
    mp.put(nums[0],0);
    for(int i = 0; i < nums.length; i++) {
        int find = target - nums[i];
        if(mp.containsKey(find)&& mp.get(find)!=i) {
            ans[0] = i;
            ans[1] = mp.get(find);
            break;
        } else {
            mp.put(nums[i], i);
        }
    }
    return ans;
}
