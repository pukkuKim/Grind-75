// My Horrible Solution
// Bit Manipulation approach 익히기!
class Solution {
    public String addBinary(String a, String b) {

        String longer = a.length() >= b.length() ? a : b;
        String shorter = longer == a ? b : a;

        return calculate(longer, shorter);
    }

    private String calculate(String longer, String shorter) {

        char[] arr = new char[longer.length() + 1];
        boolean carryOver = false;
        int diff = longer.length() - shorter.length();

        for (int i = shorter.length() - 1; i >= 0; i--) {
            if (longer.charAt(i + diff) == '1' && shorter.charAt(i) == '1') {
                if (carryOver) {
                    arr[i+1+diff] = '1';
                } else {
                    arr[i+1+diff] = '0';
                }
                carryOver = true;
            } else if (longer.charAt(i + diff) == '1' || shorter.charAt(i) == '1') {
                if (carryOver) {
                    arr[i+1+diff] = '0';
                } else {
                    arr[i+1+diff] = '1';
                }
            } else {
                if (carryOver) {
                    arr[i+1+diff] = '1';
                } else {
                    arr[i+1+diff] = '0';
                }
                carryOver = false;
            }
        }

        if (diff > 0) {
            if (!carryOver) {
                for (int i = 0; i < diff; i++) {
                    arr[i+1] = longer.charAt(i);
                }
            } else {
                for (int i = diff - 1; i >= 0; i--) {
                    if (carryOver) {
                        if (longer.charAt(i) == '1') {
                            arr[i+1] = '0';
                        } else {
                            arr[i+1] = '1';
                            carryOver = false;
                        }
                    } else {
                        arr[i+1] = longer.charAt(i);
                    }
                }
            }
        }

        arr[0] = carryOver ? '1' : '0';

        String answer = "";

        for (int i = arr[0] == '0' ? 1 : 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }
}