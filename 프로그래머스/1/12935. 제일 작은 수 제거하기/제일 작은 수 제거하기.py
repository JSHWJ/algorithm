def solution(arr):
    answer = [x for x in arr]
    num = min(answer)
    
    if len(answer) != 1:
        answer.remove(num)
        return answer
    else:
        return [-1]
    