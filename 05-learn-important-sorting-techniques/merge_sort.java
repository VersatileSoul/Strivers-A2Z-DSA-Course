void main() {
    int[] arr = {3,1,2,4,1,5,2,6,4};
    int low = 0;
    int high = arr.length - 1;
    mergeSort(arr,low,high);
    for (int i : arr) IO.print(i + " ");
    IO.println();
}

void mergeSort(int []arr, int low, int high) {
    if(low>=high) {
        return;
    }
    int mid = (low+high)/2;
    mergeSort(arr,low,mid);
    mergeSort(arr,mid+1,high);
    merge(arr,low,mid,high);
}

void merge(int[] arr, int low, int mid, int high) {
    ArrayList<Integer> ls = new ArrayList<>();
    int left = low;
    int right = mid + 1;
    while(left <= mid && right <= high) {
        if(arr[left] >= arr[right]) {
            ls.add(arr[right++]);
        }
        else {
            ls.add(arr[left++]);
        }
    }
    while(left <= mid) {
        ls.add(arr[left++]);
    }
    while (right <= high) {
        ls.add(arr[right++]);
    }
    for(int i = low; i <= high; i++) {
        arr[i] = ls.get(i-low);
    }
}