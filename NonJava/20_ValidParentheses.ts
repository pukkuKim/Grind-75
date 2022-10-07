function isValid(s: string): boolean {
    
    //     const map = new Map();
        
    //     map.set(')', '(');
    //     map.set('}', '{');
    //     map.set(']', '[');
        
        const map: {[key: string]: string} = {
            ')': '(',
            '}': '{',
            ']': '['
        }
        
        const stack: Array<string> = [];
        
        for (let i = 0; i < s.length; i++) {
            if (!Object.keys(map).includes(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (stack.length !== 0 && stack[stack.length - 1] === map[s.charAt(i)]) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        
        return stack.length === 0;
    };