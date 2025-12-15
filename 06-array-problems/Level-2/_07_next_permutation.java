void main() {
    int[] arr = {2,3,1,3,3};
    nextPermutation(arr);
    for(int i : arr) {
        IO.print(i + " ");
    }
    IO.println();
}
public void nextPermutation(int[] nums) {
    int len = nums.length;
    if(len == 1) {
        return;
    }
    if(len == 2) {
        swap(nums,0,1);
        return;
    }
    int breakPoint = 0;
    int pointer = -1;
    for(int i = len - 2; i >= 0; i--) {
        if(nums[i+1] > nums[i]) {
            breakPoint = nums[i];
            pointer = i;
            break;
        }
    }
    if(pointer == -1) {
        reverse(nums,0,len-1);
        return;
    }
    int justMax = Integer.MAX_VALUE;
    int justMaxPointer = -1;
    for(int i = pointer+1; i < len; i++) {
        if(nums[i] > breakPoint && justMax >= nums[i]) {
            justMax = nums[i];
            justMaxPointer = i;
        }
    }
    swap(nums,pointer,justMaxPointer);
    reverse(nums,pointer+1,len-1);
}


public void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

public void reverse(int[] nums, int i, int j) {
    while(i < j && nums[i] > nums[j]) {
        swap(nums,i,j);
        i++;
        j--;
    }
}