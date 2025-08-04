public class maxprofit {
    public static void main(String[] args) {
        int[] prices = {7,5, 6, 4};
        System.out.println(maxProfit(prices));  
        opmetode(prices);
    }        

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > maxProfit) {
                    maxProfit = prices[j] - prices[i];
                }
            }
        }
        return maxProfit;
    }
    public static void opmetode(int[] price) {
        int maxprofit = 0;
        int left=0;
        int right=1;
        while (right<price[left]){
            if(price[right]>price[left]){
                int profit = price[right]-price[left];
                maxprofit = Math.max(maxprofit, profit);
            }
            else{
                left = right;
            }
            right++;
        }
        System.out.println("Max profit:"+maxprofit);
        
    }
}
