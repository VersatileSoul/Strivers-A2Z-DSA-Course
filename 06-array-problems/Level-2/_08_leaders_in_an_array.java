void main() {
    int[] arr = {6, 7, 4, 2, 5, 3};
    int[] ans = findLeaders(arr);
    for(int i : ans) {
        IO.print(i + " ");
    }
    IO.println();
}
public int[] findLeaders(int[] nums) {
    List<Integer> ans = new ArrayList<>();
    int max = -1;
    for (int i = nums.length - 1; i >= 0; i--) {
        if(nums[i] > max) {
            ans.add(nums[i]);
            max = nums[i];
        }
    }
    int temp = ans.size()-1;
    int[] res = new int[ans.size()];
    for (int i = 0; i < ans.size(); i++) {
        res[i] = ans.get(temp--);
    }
    return res;
}