class Solution:
    def reverseString(self, s: List[str]) -> None:
        temp = []
        for a in range(len(s) - 1 , - 1 ,-1):
            temp.append(s[a])
        for i in range(len(s)):
            s[i] = temp[i]
