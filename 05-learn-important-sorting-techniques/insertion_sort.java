void main() {
    int[] arr = {13,46,24,52,20,9};

    insertionSort(arr);
    for (int i : arr) IO.print(i + " ");
    IO.println();

}

public void insertionSort(int[] arr) {
    for(int i = 1; i < arr.length; i++) {
        int j = i-1;
        int temp = i;
        while(j >= 0 && arr[j]>arr[temp]) {
            swap(arr,temp,j);
            j--;
            temp--;
        }
    }
}
public void swap(int[] arr,int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}