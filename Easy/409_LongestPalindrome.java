class Solution {
    public int longestPalindrome(String s) {
        
        // case sensitive
        
        // We're BUILDING the longest palindrome from the given input
        
        if (s.length() == 1) {
            return 1;
        }
        
        Map<Character, Integer> map = new HashMap<>();
        Boolean odd = false;
        int count = 0;
        
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        for (char ch : map.keySet()) {
            if (map.get(ch) % 2 == 0) {
                count += map.get(ch);
            } else {
                count += map.get(ch) - 1;
                odd = true;
            }
        }
        
        return odd ? count + 1 : count;
    }
}