class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        num = list(map(str,digits))
        number = int(''.join(num))+1
        res = []
        while(number!=0):
            digit = number%10
            res.append(digit)
            number = number//10
        return res[::-1]