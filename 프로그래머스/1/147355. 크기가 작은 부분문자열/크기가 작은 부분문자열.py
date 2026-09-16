def solution(t, p):
    
    cut = len(p)
    nums = []
    cnt = 0
    
    nums.append(int(t[0:cut]))
    
    for i in range(1, len(t) +1 - cut):
        if(i+cut > len(t)):
            break
        nums.append(int(t[i:i+cut]))
    
    
    for i in range(len(nums)):
        if nums[i] <= int(p):
                    cnt += 1
    answer = cnt
    return answer