/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;

        // My Attempt: not working because of overflow caused by "low + high"
        // while (low < high) {
        //     if (isBadVersion((low + high) / 2)) {
        //         high = (low + high) / 2;
        //     } else {
        //         low = ((low + high) / 2) + 1;
        //     }
        // }

        // LC Solution에서 힌트: handled the overflow problem
        while (low < high) {
            if (isBadVersion(low + ((high - low) / 2))) {
                high = low + ((high - low) / 2);
            } else {
                low = low + ((high - low) / 2) + 1;
            }
        }

        return high;
    }
}