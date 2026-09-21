class Solution:
    def arrangeCoins(self, n: int) -> int:
        num = 0
        while  num - n > 0:
            n = n - num
            num += 1

        return num