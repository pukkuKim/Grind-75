// Time Complexity: O(NlogN) because of sorting
// Space Complexity: O(1)
class Solution {
    public boolean containsDuplicate(int[] nums) {

        if (nums.length <= 1) {
            return false;
        }

        // sort first, so when you iterate over the array,
        // same element is placed right after the other, if any exists
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return true;
            }
        }

        return false;
    }
}