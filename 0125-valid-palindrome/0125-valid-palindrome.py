class Solution:
    def isPalindrome(self, s: str) -> bool:
        newStr = ""
        for char in s:
            if(char.isalnum()):
                newStr+=char
        newStr = newStr.lower()
        lp = 0
        rp = len(newStr)-1
        while(lp<=rp):
            if(newStr[lp]!=newStr[rp]):
                return False
            lp+=1
            rp-=1
        return True
        