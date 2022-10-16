class Solution {
    public boolean canAttendMeetings(int[][] intervals) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] keys = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            map.put(intervals[i][0], intervals[i][1]);
            keys[i] = intervals[i][0];
        }

        Arrays.sort(keys);

        for (int i = 1; i < keys.length; i++) {
            if (map.get(keys[i-1]) > keys[i]) {
                return false;
            }
        }

        return true;
    }
}