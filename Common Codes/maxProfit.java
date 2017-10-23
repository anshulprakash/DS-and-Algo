public static int maxProfit(int[] a) {
    int profit = 0;
    for(int i = 1; i < a.length; i++){
        if(a[i] - a[i-1] > 0){
            profit = profit + a[i] - a[i-1];
        }
    }
    if(profit > 0){
        return profit;
    }
    return 0;
}
