void main() {
    int[] nums = {1,0,1,1,0,1};

    int maxConsecutiveOnes = findMaxConsecutiveOnes(nums);

    IO.println(maxConsecutiveOnes);
}

public int findMaxConsecutiveOnes(int[] nums) {
    int maxOnes = 0;
    int count = 0;
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] != 1) {
            maxOnes = Math.max(maxOnes,count);
            count = 0;
        }
        else {
            count++;
        }
    }
    maxOnes = Math.max(maxOnes,count);
    return maxOnes;
}

