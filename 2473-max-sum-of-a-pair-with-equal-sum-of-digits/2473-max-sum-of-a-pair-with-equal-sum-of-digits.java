class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> maxdig = new HashMap<>();
        int maxSum = -1;

        for (int num : nums) {
            int digitSum = sum(num);

            if (maxdig.containsKey(digitSum)) {
                // Found another number with the same digit sum → Compute max sum
                maxSum = Math.max(maxSum, num + maxdig.get(digitSum));

                // Update max for this digit sum
                maxdig.put(digitSum, Math.max(maxdig.get(digitSum), num));
            } else {
                maxdig.put(digitSum, num);
            }
        }

        return maxSum;
    }

    private int sum(int num) {
        int s = 0;
        while (num != 0) {
            s += num % 10;
            num /= 10;
        }
        return s;
    }
}
