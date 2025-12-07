void main() {
    int[] arr = {1,2,1,3,2};

    int[] hash = new int[11];

    for(int k : arr) {
        hash[k]++;
    }

    int[] query = {1,3,4,2,10};

    for(int j : query) {
        IO.println(j + " -> " + hash[j]);
    }
}