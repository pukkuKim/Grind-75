function maxProfit(prices: number[]): number {

    let minPoint: number = prices[0];
    let diff: number = 0;

    for (let i = 0; i < prices.length; i++) {
        if (prices[i] < minPoint) {
            minPoint = prices[i];
        }
        if (prices[i] - minPoint > diff) {
            diff = prices[i] - minPoint;
        }
    }

    return diff;
};