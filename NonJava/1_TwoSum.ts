function twoSum(nums: number[], target: number): number[] {

    const map = new Map<number, number>();

    for (let i = 0; i < nums.length; i++) {
        map.set(nums[i], i);
    }

    for (let i = 0; i < nums.length; i++) {
        const lookFor = target - nums[i];
        if (map.has(lookFor) && map.get(lookFor) !== i) {
            return [i, map.get(lookFor)];
        }
    }

    return null;
};