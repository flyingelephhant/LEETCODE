class Solution {
    public int largestAltitude(int[] gain) {
        int max = gain[0];
        for (int i = 1; i < gain.length; i++) {
            gain[i] += gain[i - 1];

            if (gain[i] > max)
                max = gain[i];
        }
        return (max < 0) ? 0 : max;

    }
}