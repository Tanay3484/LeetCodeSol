class Solution:
    def reverseWords(self, s: str) -> str:
        res = ""
        l = s.split(" ")
        for wrd in l:
            wrd = wrd[::-1]
            res += wrd
            res += " "
        
        res = res.strip()
        return res