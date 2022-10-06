class Solution {
    public boolean isValid(String s) {
        // 먼저 짝꿍 맞추기
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        
        // 스택 생성
        Stack<Character> stack = new Stack();
        for (Character ch : s.toCharArray()) {
            if (!map.keySet().contains(ch)) {
                stack.push(ch);
            } else {
                if (!stack.isEmpty()) {
                    if (stack.peek() == map.get(ch)) {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}