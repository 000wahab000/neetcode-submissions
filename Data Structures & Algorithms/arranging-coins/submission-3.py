class Solution:
    def arrangeCoins(self, n: int) -> int:
        num = 1
        while  n >= num:
            n -= num
            num += 1

        return num