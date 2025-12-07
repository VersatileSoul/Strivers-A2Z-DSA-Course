void main() {
    int[] arr = {4,2,3,6,8};

    int max = arr[0];
    for(int i = 0; i < arr.length; i++) {
        if(arr[i] >= max) {
            max = arr[i];
        }
    }
    IO.println(max);
}