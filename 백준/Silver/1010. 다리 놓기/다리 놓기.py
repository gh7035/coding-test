import math

a = int(input())

for _ in range(a):
    b, c = map(int, input().split())

    result = math.comb(c,b)
    print(result)