package com.apexsystems.challenges;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeBuySellStockTest {

    @Test
    public void maxProfitTest(){

        Assert.assertEquals(5,BestTimeBuySellStock.maxProfit(new int[]{7,1,5,3,6,4}));
        Assert.assertEquals(0,BestTimeBuySellStock.maxProfit(new int[]{7,6,4,3,1}));

    }
}
