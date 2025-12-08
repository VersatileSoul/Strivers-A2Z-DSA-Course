void main() {
    int[] arr = {5, 1, 7};

    int max = 0;
    int secondMax = 0;

    for(int i = 0; i < arr.length; i++) {
        if(arr[i] > max) {
            secondMax = max;
            max = arr[i];
        }
        if(arr[i] != max && arr[i] > secondMax) {
            secondMax = arr[i];
        }
    }
    IO.println(max);
    IO.println(secondMax);

//    for(int i = 0; i < arr.length; i++) {
//        max = Math.max(arr[i],max);
//    }
//    IO.println(max);
//    for(int i = 0; i < arr.length; i++)
//    {
//        if(arr[i] != max) {
//            secondMax = Math.max(arr[i],secondMax);
//        }
//    }
//    IO.println(secondMax);

}