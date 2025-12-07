void main() {
    int[] arr = {1,2,3,4,5,6,7};
    int k = 3;
    for(int i : arr) {
        IO.print(i + " ");
    }
    IO.println();
    rotate(arr,k);
    for(int i : arr) {
        IO.print(i + " ");
    }
    IO.println();
}
void rotate(int[] arr, int k) {
    k = k % arr.length;
    int[] temp1 = new int[arr.length-k];
    int[] temp2 = new int[k];
    int n1 = temp1.length;
    int n2 = temp2.length;
    for(int i = 0; i < arr.length; i++) {
        if(i < temp1.length) {
            temp1[i] = arr[i];
        } else {
            temp2[i-n1] = arr[i];
        }
    }
    for(int i = 0; i < arr.length; i++) {
        if(n2 > 0) {
            arr[i] = temp2[i];
            n2--;
        }
        else {
            arr[i] = temp1[i-temp2.length];
        }
    }
}