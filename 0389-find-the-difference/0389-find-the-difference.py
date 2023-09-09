class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        freqMap = {}
        
        for c in t:
            if(c in freqMap.keys()):
                freqMap[c]+=1
            else:
                freqMap[c]=1
        
        for c in s:
            if(c in freqMap.keys()):
                freqMap[c]-=1
                
            if(freqMap[c]<=0):
                del freqMap[c]
        
        res = [i for i in freqMap if freqMap[i]==1]
        return res[0]