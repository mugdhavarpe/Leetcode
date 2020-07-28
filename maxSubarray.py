import math
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        max_sum = max(nums)
        temp_sum = 0
        for num in nums:
            temp_sum += num
            if temp_sum > max_sum:
                max_sum = temp_sum
            if temp_sum < 0:
                temp_sum = 0
        return max_sum    
        
