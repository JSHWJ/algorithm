def solution(x, n):
    answer = []
    
    for i in range(n):
        answer.append(x + x * i)
    return answer