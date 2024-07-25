package org.example.interview;

//You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
//
//On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
//
//Find and return the maximum profit you can achieve.
//
//Input: prices = [7,1,5,6,4]

// index 0 = max o(n)
// index 1 = min o(n)

// [7, 5,6,4,1]
//Output: 7


import java.util.Arrays;

public class MaximumProfit {
    public static void main(String[] args) {
        int[] arr = {7,5,6,1,4,2,3};
        System.out.println(maxProfit(arr));
        int[] copyArr = Arrays.copyOf(arr, arr.length);
        int[] peakIndex = new int[arr.length];
        Arrays.fill(peakIndex, -1);
       /* int[] leastIndex = new int[arr.length];
        Arrays.fill(leastIndex, -1);*/
        int start =0;
        while(peakIndex[peakIndex.length-1] == -1) {
            peakIndex[start++] = findIndex(copyArr,true);
        }
        /*start = 0;
        copyArr = Arrays.copyOf(arr, arr.length);
        while(leastIndex[leastIndex.length-1] == -1) {
            leastIndex[start++] = findIndex(copyArr,  false);
        }*/
        int maxDiff = 0;
        /*for(int i =0; i< arr.length; i++) {
            for(int j =0;j< arr.length; j++) {
                if(peakIndex[i] < leastIndex[j]) {
                    continue;
                } else {
                    maxDiff = Math.max(arr[peakIndex[i]] - arr[leastIndex[j]], maxDiff);
                }
            }
        }*/
        int k =0;

        for(int i=0; i<= peakIndex.length/2; i++) {
            if(peakIndex[i] < peakIndex[peakIndex.length-1-i]) {
                continue;
            }
            maxDiff = Math.max(arr[peakIndex[i]] - arr[peakIndex.length-1-i] , maxDiff);
        }
        System.out.println(maxDiff);
    }

    public static int findIndex(int[] arr, boolean max) {
        int maxMin =max ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        int index = 0;
        for(int i=0; i< arr.length ; i++) {
            if(max) {
                if(arr[i] > maxMin) {
                    maxMin = arr[i];
                    index = i;

                }
            } else {
                if(arr[i] < maxMin) {
                    maxMin = arr[i];
                    index = i;
                }
            }
        }
        if(max) {
            arr[index] = Integer.MIN_VALUE;
        } else
            arr[index] = Integer.MAX_VALUE;

        return index;

    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;  // No profit if there are less than 2 days
        }

        int minPrice = prices[0];  // Initialize minPrice to the first element
        int maxProfit = 0;         // Maximum profit starts at 0

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > minPrice) {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);  // Update maxProfit if selling today gives more profit
            } else {
                minPrice = prices[i];  // Update minPrice if current price is lower
            }
        }

        return maxProfit;
    }
}

