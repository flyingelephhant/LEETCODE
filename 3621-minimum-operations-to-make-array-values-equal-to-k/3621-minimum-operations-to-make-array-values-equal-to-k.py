class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        hashSet = set()

        for i in range(len(nums)):
            if nums[i] < k:
                return -1
            hashSet.add(nums[i])
        
        return len(hashSet) - 1 if k in hashSet else len(hashSet)