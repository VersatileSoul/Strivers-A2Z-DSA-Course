void main() {
    int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
    int[] arr2 = {2,3,4,4,5,11,12};
    int m = 10;
    int n = 7;
    int[] mergedArray = union(arr1,arr2,m,n);
    for(int i : mergedArray) IO.print(i + " ");
    IO.println();
}

int[] union(int[] arr1, int[] arr2, int m, int n ) {
    ArrayList<Integer> ls = new ArrayList<>();
    int i = 0; int j = 0;
    while(i < m && j < n) {
        if(arr1[i] < arr2[j]) {
            if(ls.isEmpty() || ls.getLast() != arr1[i]) ls.add(arr1[i]);
            i++;
        }
        else if(arr1[i] > arr2[j]) {
            if(ls.isEmpty() || ls.getLast()!=arr2[j]) ls.add(arr2[j]);
            j++;
        }
        else {
            ls.add(arr1[i]);
            i++;
            j++;
        }
    }
    while(i < m) {
        if(ls.isEmpty() || ls.getLast()!=arr1[i]) ls.add(arr1[i]);
        i++;
    }
    while(j < n) {
        if(ls.isEmpty() || ls.getLast()!=arr2[j]) ls.add(arr2[j]);
        j++;
    }
    return ls.stream().mapToInt(Integer::intValue).toArray();
}