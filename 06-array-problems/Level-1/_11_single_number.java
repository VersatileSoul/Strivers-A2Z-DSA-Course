void main() {
    int[] arr = {2,2,1};
    int num = singleNumber(arr);
    IO.println(num);
}
public int singleNumber(int[] nums) {
    int x = 0;
    for(int i = 0; i < nums.length; i++) {
        x ^= nums[i];
    }
    return x;
}