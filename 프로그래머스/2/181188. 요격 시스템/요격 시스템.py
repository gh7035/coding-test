def solution(targets):
    answer = 0
    
    targets.sort(key=lambda x : x[1])
    last_shoot_x = -1
    
    for start, end in targets:
        if start >= last_shoot_x:
            answer += 1
            last_shoot_x = end
    
    return answer

