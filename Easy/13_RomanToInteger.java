class Solution {
    public int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (i != s.length() - 1) {
                if (s.charAt(i) == 'I' &&
                        (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')) {
                    ans -= map.get(s.charAt(i));
                } else if (s.charAt(i) == 'X' &&
                        (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')) {
                    ans -= map.get(s.charAt(i));
                } else if (s.charAt(i) == 'C' &&
                        (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')) {
                    ans -= map.get(s.charAt(i));
                } else {
                    ans += map.get(s.charAt(i));
                }
            } else {
                ans += map.get(s.charAt(i));
            }
        }

        return ans;
    }
}