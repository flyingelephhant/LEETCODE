class Solution:
    def maxAbsoluteSum(self, nums: List[int]) -> int:
        pos_sum = neg_sum = max_sum = min_sum = 0

        for x in nums:
            pos_sum = max(x, pos_sum + x)
            neg_sum = min(x, neg_sum + x)

            max_sum = max(max_sum, pos_sum)
            min_sum = min(min_sum, neg_sum)

        return max(max_sum, abs(min_sum))
