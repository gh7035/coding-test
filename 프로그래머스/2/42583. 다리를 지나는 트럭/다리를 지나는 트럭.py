from collections import deque


def solution(bridge_length, weight, truck_weights):
    answer = 0
    bridge = deque([0] * bridge_length)
    trucks = deque(truck_weights)
    now_weight = 0
    
    while trucks or now_weight > 0:
        answer += 1
        
        now_weight -= bridge.popleft()
        if trucks and now_weight + trucks[0] <= weight:
            truck = trucks.popleft()
            bridge.append(truck)
            now_weight += truck
            
        else:
            bridge.append(0)
        
        
        
    return answer

    