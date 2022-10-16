class Solution {
    public boolean backspaceCompare(String s, String t) {
        return applyBS(s).equals(applyBS(t));
    }

    private String applyBS(String str) {
        int numOfSharps = 0;
        String newStr = "";

        List<Character> list = new ArrayList<>();

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '#') {
                numOfSharps++;
            } else {
                if (numOfSharps > 0) {
                    numOfSharps--;
                } else {
                    list.add(str.charAt(i));
                }
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            newStr += list.get(i);
        }

        return newStr;
    }
}