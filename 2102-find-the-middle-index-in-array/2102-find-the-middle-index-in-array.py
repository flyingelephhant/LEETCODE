class Solution:
    def findMiddleIndex(self, nums: List[int]) -> int:
        tsum = sum(nums)
        leftsum = 0

        for i in range(len(nums)):
            if leftsum == tsum - nums[i] - leftsum:
                return i

            leftsum += nums[i]

        return -1
