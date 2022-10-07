function isPalindrome(s: string): boolean {
    if (s.trim().length === 0) {
        return true;
    }

    const array: Array<string> = [];

    for (let i = 0; i < s.length; i++) {
        if (s.charAt(i).match(/[a-zA-Z0-9]/)) {
            array.push(s.charAt(i).toLowerCase());
        }
    }

    for (let i = 0; i < array.length / 2; i++) {
        if (array[i] !== array[array.length - 1 - i]) {
            return false;
        }
    }

    return true;
};