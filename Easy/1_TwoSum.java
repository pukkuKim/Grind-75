class Solution {
    public int[] twoSum(int[] nums, int target) {
        // key: elm in nums[]
        // value: index of the elm in nums[]
        Map<Integer, Integer> map = new HashMap<>();

        // if the same value appears, the latter one overwrites the existing one
        // it doesn't matter because we're returning just one solution
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int lookFor = target - nums[i];
            if (map.containsKey(lookFor) && map.get(lookFor) != i) {
                return new int[] {i, map.get(lookFor)};
            }
        }

        return null;
    }
}