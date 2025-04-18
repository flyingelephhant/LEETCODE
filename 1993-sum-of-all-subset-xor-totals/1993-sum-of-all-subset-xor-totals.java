class Solution {
    public int subsetXORSum(int[] nums) {
       int ans=0;
       for(var x:nums) ans |=x;

       return (ans<<(nums.length-1));
    }
}
/*
public int subsetXORSum(int[] nums) {
        return onway(nums, 0, 0);
    }

    public int onway(int[] nums, int xor, int idx) {
        if (idx == nums.length) {
            return xor;
        }
        return onway(nums, xor ^ nums[idx], idx + 1) + onway(nums, xor, idx + 1);
    }
*/