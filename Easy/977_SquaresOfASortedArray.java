// My Solution
// Time Complexity: O(NlogN)
// Space Complexity: O(logN) in Java
class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }

        // O(NlogN)
        Arrays.sort(nums);

        return nums;
    }
}

// LC Solution (Two Pointer)
// Time Complexity: O(N)
// Space Complexity: O(N)
// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int n = nums.length;
//         int[] result = new int[n];
//         int left = 0;
//         int right = n - 1;

//         for (int i = n - 1; i >= 0; i--) {
//             int square;
//             if (Math.abs(nums[left]) < Math.abs(nums[right])) {
//                 square = nums[right];
//                 right--;
//             } else {
//                 square = nums[left];
//                 left++;
//             }
//             result[i] = square * square;
//         }
//         return result;
//     }
// }