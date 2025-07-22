def solution(num_list, n):
    answer = []
    count = len(num_list) // n
    
    for c in range(count):
        temp = []
        for i in range(n):
            temp.append(num_list[c * n + i])
        answer.append(temp)
    return answer 