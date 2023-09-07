class Solution:
    def reverseWords(self, s: str) -> str:
        l = s.split(" ")
        res = ""
        for word in l[::-1]:
            if word!=' 'and word!='':
                res+=word
                res+=" "
        
        return res.strip()
        