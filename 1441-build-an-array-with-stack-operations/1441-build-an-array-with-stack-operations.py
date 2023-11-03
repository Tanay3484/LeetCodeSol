class Solution:
    def buildArray(self, target: List[int], n: int) -> List[str]:
        ans = []
        tmp = []
        for i in range(1,n+1):
            if tmp==target:
                break
            if i in target:
                tmp.append(i)
                ans.append("Push")
            else:
                ans.append("Push")
                ans.append("Pop")
        
        return ans