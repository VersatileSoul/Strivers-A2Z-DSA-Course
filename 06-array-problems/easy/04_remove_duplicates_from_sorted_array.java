void main() {
    int[] arr = {1,1,2};

    IO.println(removeDuplicates(arr));
}

public int removeDuplicates(int[] arr) {
    int cnt = 1;
    int[] newArr = new int[arr.length];
    newArr[0]=arr[0];
    int x = arr.length-1;
    int y = 1;
    for(int i = 0; i < arr.length-1; i++) {
        if(arr[i] != arr[i+1]) {
            cnt++;
            newArr[y++] = arr[i+1];
        } else {
            newArr[x--]=arr[i+1];
        }
    }
    for(int i = 0; i <= x; i++)  {
        arr[i] = newArr[i];
        IO.print(arr[i]+" ");
    }
    IO.println();
    return cnt;
}