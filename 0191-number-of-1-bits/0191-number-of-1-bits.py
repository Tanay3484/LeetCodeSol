class Solution:
    def hammingWeight(self, n: int) -> int:
        return len(''.join(str(bin(n)).split('0')))-1