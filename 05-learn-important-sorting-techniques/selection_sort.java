void main() {
    int[] arr = {13,46,24,52,20,9};

    selectionSort(arr);
    for (int i : arr) IO.print(i + " ");
    IO.println();

}

public void selectionSort(int[] arr) {

    for(int i = 0; i < arr.length - 1; i++) {
        int min = arr[i];
        int pos = i;
        for(int j = i + 1; j < arr.length; j++) {
            if(min > arr[j]) {
                pos = j;
//                min = arr[j];
            }
        }
        swap(arr,pos,i);
    }
}

public void swap(int[] arr,int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}