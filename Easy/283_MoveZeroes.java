class Solution {
    public void moveZeroes(int[] nums) {

        boolean zeroAlreadyExists = false;
        int zeroBeginsIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (zeroBeginsIndex == -1) {
                    zeroBeginsIndex = i;
                    zeroAlreadyExists = true;
                }
            } else if (nums[i] != 0 && zeroAlreadyExists) {
                nums[zeroBeginsIndex] = nums[i];
                zeroBeginsIndex++;
                nums[i] = 0;
            }
        }
    }
}