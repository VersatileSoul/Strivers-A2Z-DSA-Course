void main() {
    int[] arr = {1, 0, 2, 3};
    move(arr);
    for(int i : arr) IO.print(i + " ");
    IO.println();
}

public static void move(int[] arr) {
    int n = arr.length;
    if(n == 1) {
        return;
    }
    boolean flag = false;
    int pos = 0;
    for(int i = 0; i < n; i++) {
        if(arr[i] == 0) {
            if (!flag) {
                flag = true;
                pos = i;
            }
        }
        else {
            if(flag) {
                if (i != pos) {
                    swap(arr, i, pos);
                    pos++;
                }
            }
        }
    }
}
public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}