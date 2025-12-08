void main() {
    int[] arr = {1,1,1};

    IO.println(check(arr));
}

public boolean check(int[] arr) {
    int size = arr.length;
    int pos = -1;
    int min = Integer.MAX_VALUE;
    for(int i = size - 1; i >= 0; i--) {
        if(min >= arr[i]) {
            if(min == arr[i]) {
               if(i == pos-1) {
                   pos = i;
               }
            } else {
                pos = i;
            }
            min = arr[i];
        }
    }
    for(int i = pos; i < (pos+size)-1; i++) {
        if(arr[i % size] > arr[(i+1)%size]) {
            return false;
        }
    }
    return true;
}