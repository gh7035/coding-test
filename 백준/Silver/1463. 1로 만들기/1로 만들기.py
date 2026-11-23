a = int(input()) # 5

vals = [0] * (a+1) #0~6까지
for i in range(2, a+1): # 2부터 6까지
    vals[i] = vals[i-1] + 1 # 5번은 4번의 +1임
    if i % 3 == 0: # 불만족
        vals[i] = min(vals[i//3]+1, vals[i])

    if i % 2 == 0: #만족 
        vals[i] = min(vals[i//2]+1, vals[i]) # 1번에 +1 or 현재 값중 작은거
                                             # 여기서 1번은 0이고, 2번은 1
print(vals[a])
