public static int maxFrequency(int[] nums, int k) {
    TreeMap<Integer,Integer> mp = new TreeMap<>();
    for(int i : nums) {
        mp.put(i,mp.getOrDefault(i,0)+1);
    }
    int maxFreq = 0;
    for(Map.Entry<Integer,Integer> entry : mp.descendingMap().entrySet()) {
   //     IO.println(entry.getKey() + " " + entry.getValue());
        int targetKey = entry.getKey();
        int targetValue = entry.getValue();

        long tempMaxFreq = targetValue;
        long tempK = k;
        for(Map.Entry<Integer,Integer> innerEntry : mp.headMap(targetKey,false).descendingMap().entrySet()) {
//            IO.println(innerEntry.getKey() + " " + innerEntry.getValue());
            int tempKey = innerEntry.getKey();
            int tempValue = innerEntry.getValue();
            int x = targetKey - tempKey;
            long cost = (long)x * tempValue;
            if(cost <= tempK) {
                tempMaxFreq += tempValue;
                tempK -= cost;
            }
            else {
                long rem = tempK / x;
                tempMaxFreq = tempMaxFreq + rem;
                tempK -= rem * x;
                break;
            }
        }
        maxFreq = Math.max(maxFreq,(int)tempMaxFreq);
//        IO.println();
    }
    return maxFreq;
}
 void main() {
    int[] nums = {1,1,1,2};
    int k = 1;
    System.out.println(maxFrequency(nums, k));
}