void main() {
    int[] arr = {13,46,24,52,20,9};

    bubbleSort(arr);
    for (int i : arr) IO.print(i + " ");
    IO.println();

}

public void bubbleSort(int[] arr) {
    int x = 0;
    for(int i = 0; i < arr.length-1; i++) {
        boolean swapped = false;
        for(int j = 0; j < arr.length-x-1; j++) {
            if(arr[j] > arr[j+1]) {
                swap(arr,j,j+1);
                swapped = true;
            }
        }
        if(!swapped) {
            IO.println("Array is sorted");
            return;
        }
        x++;
    }
}

public void swap(int[] arr,int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}