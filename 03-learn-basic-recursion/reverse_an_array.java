void main() {
    int[] arr = {2,4,5,1,3,6};
    int l = 0;
    int r = arr.length-1;
    reverse(arr,l,r);
    for(int i : arr) {
        IO.print(i + " ");
    }
    IO.println();
}

public void reverse(int[] arr, int l, int r) {
    if(l >= r) {
        swap(l,r,arr);
        return;
    }
    swap(l,r,arr);
    l++;
    r--;
    reverse(arr,l,r);
}

public void swap(int a, int b, int[] arr) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
}