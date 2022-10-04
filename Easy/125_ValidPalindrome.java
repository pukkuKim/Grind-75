class Solution {
    public boolean isPalindrome(String s) {
        List<Character> list = new ArrayList<>();

        for (Character ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                list.add(Character.toLowerCase(ch));
            }
        }

        if (list.size() < 2) {
            return true;
        }

        for (int i = 0; i < list.size() / 2; i++) {
            if (list.get(i) != list.get(list.size() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}