class Solution {
    public int[] countBits(int n) {

        int[] arr = new int[n+1];

        int shiftCount = 0;

        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                shiftCount = 1;
            } else {
                shiftCount = (int) (Math.log(i) / Math.log(2)) + 1;
            }
            int ans = 0;

            for (int j = 0; j < shiftCount; j++) {
                if (((i >> j) & 1) == 1) {
                    ans++;
                }
            }

            arr[i] = ans;
        }

        return arr;
    }
}