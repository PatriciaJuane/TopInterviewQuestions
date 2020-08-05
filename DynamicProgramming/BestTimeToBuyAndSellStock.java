public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        
        for(int i=0; i<prices.length; i++) {
            if(prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        
        return maxprofit;
    }

    public static void main(String[] args) {
      int[] nums = {7,1,5,3,6,4};
      System.out.println(maxProfit(nums)); // 5
      int[] nums2 = {7,6,4,3,1};
      System.out.println(maxProfit(nums2)); //0
    }
}