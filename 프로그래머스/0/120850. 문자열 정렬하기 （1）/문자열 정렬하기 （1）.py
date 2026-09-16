def solution(my_string):
    answer = []
    for i in range(len(my_string)):
        num = my_string[i]
        if num.isdigit():
            answer.append(int(num))
            
            
    answer.sort()
    return answer