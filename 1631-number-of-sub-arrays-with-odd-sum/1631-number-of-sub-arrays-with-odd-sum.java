class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        long ans = 0;
        int evencnt = 1, oddcnt = 0; // As pre=0 so evencnt=1 it will help if
        int pre = 0;                 //.. n[i] is odd so single element

        for (int i = 0; i < n; i++) {
            pre += arr[i];

            if (pre % 2 != 0) {// Odd hai-->EVEN+ODD=ODD so find even sum seen before
                ans += evencnt;
                oddcnt++;
            } else {// Even hai-->ODD+EVEN=ODD so find odd seen before
                ans += oddcnt;
                evencnt++;
            }
        }
        return (int)(ans % 1000000007);
    }
}