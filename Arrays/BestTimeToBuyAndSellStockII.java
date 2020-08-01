import java.util.*;
// Best Time to Buy and Sell Stock II
public class BestTimeToBuyAndSellStockII {

    public static int maxProfit(int[] prices) {
      int maxprofit = 0;
      for(int i=1; i<prices.length; i++) {
        if(prices[i]>prices[i-1]) {
          maxprofit += (prices[i]-prices[i-1]);
        }
      }
        
      return maxprofit;
    }

    public static void main(String[] args) {
      int[] nums = {7,1,5,3,6,4};
      System.out.println(maxProfit(nums)); // 7

      int[] nums2 = {1,2,3,4,5};
      System.out.println(maxProfit(nums2)); // 4

      int[] nums3 = {7,6,4,3,1};
      System.out.println(maxProfit(nums3)); // 0
    }
}