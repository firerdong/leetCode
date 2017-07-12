package com.dong;

public class BestTimetoBuyandSellStock {
	
	/*
	 * Time Limit Exceeded 	
	 */
    public static int maxProfit_wrong(int[] prices) {
        if(prices == null || prices.length <= 1) {
            return 0;
        }
        int max = 0;
        for(int i=0;i<=prices.length-1;i++) {
        	max = Math.max(max, helper(prices, 0,i) + helper(prices, i+1, prices.length-1));
        }
        return max;
    }
    private static int helper(int[] prices, int start, int end) {
    	if(end - start <= 0) {
    		return 0;
    	}
    	int local = prices[start+1] - prices[start];
    	int global = local;
    	for(int i=start+2; i<=end; i++) {
    		int tmp = prices[i] - prices[i-1];
    		local = Math.max(tmp + local, tmp);
    		global = Math.max(global, local);
    	}
    	return global >= 0?global:0;
    }
    
    public static  int maxProfit3(int[] prices) {
        int hold1 = Integer.MIN_VALUE, hold2 = Integer.MIN_VALUE;
        int release1 = 0, release2 = 0;
        for(int i = 0; i < prices.length; i++){
        	//买入默认值=最小int，  hold1 为 max{上次的hold1,  0 - 本次买入的价格 }
            hold1 = Math.max(hold1, -prices[i]);
            //卖出默认值为0, release1 为 max{上次的release1， hold1 + 本次卖出的价格}
            release1 = Math.max(release1, hold1 + prices[i]);
           //买入默认值=最小int，  hold2 为 max{上次的hold2,  release1 - 本次买入的价格 }
            hold2 = Math.max(hold2, release1 - prices[i]);
          //卖出默认值为0, release2 为 max{上次的release2， hold2 + 本次卖出的价格}
            release2 = Math.max(release2, hold2 + prices[i]);
        }
        return release2;
    }
    
}
