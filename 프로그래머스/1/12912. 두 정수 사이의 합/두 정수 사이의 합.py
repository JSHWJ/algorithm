def solution(a, b):
    answer = 0
    for index in range(min(a, b), max(a, b) + 1):
        answer += index
    return answer