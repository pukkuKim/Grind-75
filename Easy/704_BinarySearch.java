class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            if (target == nums[(high + low) / 2]) {
                return (high + low) / 2;
            } else if (target < nums[(high + low) / 2]) {
                high = ((high + low) / 2) - 1;
            } else {
                low = ((high + low) / 2) + 1;
            }
        }

        return -1;
    }
}