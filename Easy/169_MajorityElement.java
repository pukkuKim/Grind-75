class Solution {
    public int majorityElement(int[] nums) {

        if (nums.length <= 2) {
            return nums[0];
        }

        Map<Integer, Integer> map = new HashMap<>();

        // we want to find a key whose value is over nums.length / 2
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if (map.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }
}