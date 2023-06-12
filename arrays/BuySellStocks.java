package com.akash.arrays;

import java.util.*;
public class BuySellStocks {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(Stocks(prices));

    }
    public static int Stocks(int[] prices){
        //here mini means the minimum cost of the stock for first day
        int mini=prices[0];
        //for first day the maximum profit will be zero because u can only just buy stock for 1st day
        int maxprofit=0;
        for(int i=1;i< prices.length;i++){
            int profit=prices[i]-mini;
            maxprofit=Math.max(profit,maxprofit);
            mini=Math.min(prices[i],mini);
        }
        return maxprofit;
    }
}
