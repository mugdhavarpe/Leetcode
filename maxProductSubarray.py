class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        max_product = max(nums)
       
       
        if len(nums) == 1:
            return nums[0]
        for index in range(len(nums)):
            temp_product = nums[index]
            for index2 in range(index+1, len(nums)):
                temp_product *= nums[index2]

                if temp_product > max_product:
                    max_product = temp_product

                # if max_product < 0 and temp_product < 0:
                #     temp_product = 1

        return max_product
