void main() {
    int[] arr = {3,0,1};

    int missingNum = missingNumber(arr);

    IO.println(missingNum);
}

public int missingNumber(int[] nums) {
    int n = nums.length;
    int sum = 0;
    for(int i : nums) {
        sum += i;
    }

    int totalSum = (n*(n+1))/2;

    return totalSum - sum;
}