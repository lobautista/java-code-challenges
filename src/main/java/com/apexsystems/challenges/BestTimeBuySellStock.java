package com.apexsystems.challenges;

/*
    You are given an array prices where prices[i] is the price of a given stock on the ith day.

    You want to maximize your profit by choosing a single day to buy one stock and choosing
    a different day in the future to sell that stock.

    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */

public class BestTimeBuySellStock {
    public static int maxProfit(int[] prices) {
        int profit=0;
        int cheapest=10001;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<cheapest){
                cheapest=prices[i];
            }else{
                if(prices[i]-cheapest>profit){
                    profit=prices[i]-cheapest;
                }
            }
        }
        return profit;
    }
}
