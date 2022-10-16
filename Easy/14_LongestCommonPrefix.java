class Solution {
    public String longestCommonPrefix(String[] strs) {
        int shortest = strs[0].length();

        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < shortest) {
                shortest = strs[i].length();
            }
        }

        String newStr = "";

        if (shortest == 0) return newStr;

        boolean breakFlag = false;

        for (int i = 0; i < shortest; i++) {
            Set<Character> set = new HashSet<>();
            set.add(strs[0].charAt(i));
            for (int j = 1; j < strs.length; j++) {
                if (set.add(strs[j].charAt(i))) {
                    breakFlag = true;
                    break;
                }
            }
            if (breakFlag) break;
            newStr += strs[0].charAt(i);
        }

        return newStr;
    }
}