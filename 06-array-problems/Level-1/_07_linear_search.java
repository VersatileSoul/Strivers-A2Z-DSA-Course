void main() {
    int[] arr = {1,2,3,4,5,6};

    int num = Integer.parseInt(IO.readln("Enter a number: "));

    IO.println(findNum(arr,num));
}

public int findNum(int[] arr, int num) {
    for(int i = 0; i < arr.length; i++) {
        if(arr[i] == num) {
            return i;
        }
    }
    return -1;
}