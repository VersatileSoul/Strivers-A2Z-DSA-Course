void main() {
    int[] arr = {1,2,1,3,2};

//    Map<Integer,Integer> mp = new HashMap<>();
    Map<Integer,Integer> maintainOrder = new LinkedHashMap<>();
    for(int i : arr) maintainOrder.put(i,maintainOrder.getOrDefault(i,0)+1);

    for(Map.Entry<Integer,Integer> entry : maintainOrder.entrySet()) {
        IO.println(entry.getKey() + " -> " + entry.getValue());
    }

//    IO.println(maintainOrder);

}