void main() {
    int[] arr = {2,2,1,1,1,1,3};
    int ans = majorityElement(arr);
    IO.println(ans);
}
public static int majorityElement(int[] arr) {
    int ans = 0, cnt = 0;
    for(int i : arr) {
        if(cnt == 0) {
            ans = i;
            cnt = 1;
        } else if(i == ans) {
            cnt++;
        } else {
            cnt--;
        }
    }
    return ans;
}