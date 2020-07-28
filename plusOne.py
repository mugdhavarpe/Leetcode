class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        str1 = ''.join(str(e) for e in digits)
        str1 = int(str1)+1
        del digits[:]
        for val in str(str1):
            digits.append(val)
        
        return digits        
                
