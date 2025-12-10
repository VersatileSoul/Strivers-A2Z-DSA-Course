void main() {
    int[] arr = {7,1,5,3,4,6};
    int ans = maxProfit(arr);
    IO.println(ans);
}
public int maxProfit(int[] prices) {
    int maxProf = 0;
//    for(int i = 0; i < prices.length; i++) {
//        int temp = prices[i];
//        for(int j = i+1; j < prices.length; j++) {
//            if(temp < prices[j]) {
//                maxProf = Math.max(maxProf,prices[j]-temp);
//            }
//        }
//    }
    int minCost = prices[0];
    for(int i : prices) {
        if(i < minCost) {
            minCost = i;
        } else {
            int currProfit = i - minCost;
            maxProf = Math.max(currProfit,maxProf);
        }
    }
    return maxProf;
}