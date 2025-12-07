void main() {
    int[] arr = {3,1,2,4,1,5,2,6,4};
    int low = 0;
    int high = arr.length - 1;
    quickSort(arr,low,high);
    for (int i : arr) IO.print(i + " ");
    IO.println();
}

public void quickSort(int[] arr, int low, int high) {
    if(low >= high) {
        return;
    }
    int partitionIndex = partitionIndex(arr,low,high);
    quickSort(arr,low,partitionIndex-1);
    quickSort(arr,partitionIndex+1,high);
}

public int partitionIndex(int[] arr, int low, int high) {
    int pivot = arr[low];
    int i = low;
    int j = high;
    while(i < j) {
        while(arr[i] <= pivot && i <= high) {
            i++;
        }

        while(arr[j] > pivot && j >= low) {
            j--;
        }
        if(i < j) swap(arr,i,j);
    }
    swap(arr,low,j);
    return j;
}

public void swap(int[] arr,int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}