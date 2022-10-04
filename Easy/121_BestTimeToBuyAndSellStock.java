class Solution {
    public int maxProfit(int[] prices) {
        // calculate the difference. we want the biggest.
        // need to track the min point as we move along. lower the better.
        // re-calculate the difference based on the new min point
        // compare the existing max difference w/ the current difference (from min point)

        int minPoint = prices[0];
        int diff = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPoint) {
                minPoint = prices[i];
            }
            if (prices[i] - minPoint > diff) {
                diff = prices[i] - minPoint;
            }
        }

        return diff;
    }
}