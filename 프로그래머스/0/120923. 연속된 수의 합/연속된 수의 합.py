def solution(num, total):
    answer = []
    sum = 0
    
    for i in range(num):
        sum += i
    
    target = (total - sum) / num
    
    for i in range(num):
        answer.append(target + i)
        
    return answer