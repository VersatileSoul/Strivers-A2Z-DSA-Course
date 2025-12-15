void main() {
    int[] arr = {-1, -2, -3, -4,  1,  2,  3,  4};
    int[] ans = rearrangeArrayInPlace(arr);
    for(int i : ans) {
        IO.print(i + " ");
    }
    IO.println();
    for(int i : arr) {
        IO.print(i + " ");
    }
    IO.println();
}
public int[] rearrangeArray(int[] nums) {
    int len = nums.length;
    // len /= 2;
    int[] pos = new int[len/2];
    int[] neg = new int[len/2];
    int j = 0, k = 0, l = 0;
    for(int i = 0; i < len; i++) {
        if(nums[i] >= 0) {
            pos[j++] = nums[i];
        } else {
            neg[k++] = nums[i];
        }
    }
    j = 0; k = 0;
    while(j < len/2 && k < len/2) {
        nums[l++] = pos[j++];
        nums[l++] = neg[k++];
    }
    return nums;
}
public int[] rearrangeArray2(int[] nums) {
    int len = nums.length;
    int[] ans = new int[len];
    int j = 0; int k = 1;
    for(int i = 0; i < len; i++) {
        if(nums[i] >= 0) {
            ans[j] = nums[i];
            j+=2;
        } else {
            ans[k] = nums[i];
            k+=2;
        }
    }
    return ans;
}

public int[] rearrangeArrayInPlace(int[] nums) {
    int len = nums.length;
    for(int i = 0; i < len; i++) {
        int temp = nums[i];
        if(i % 2 == 0) {
            if(temp >= 0) continue;
            for(int j = i + 1; j < len; j++) {
                if(nums[j] >= 0) {
                    int x = i;
                    while(x < j) {
                        swap(nums,x++, j);
                    }
                    break;
                }
            }
        } else {
            if(temp < 0) continue;
            for(int j = i + 1; j < len; j++) {
                if(nums[j] < 0) {
                    int x = i;
                    while(x < j) {
                        swap(nums,x++, j);
                    }
                    break;
                }
            }
        }
    }
    return nums;
}

public void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}