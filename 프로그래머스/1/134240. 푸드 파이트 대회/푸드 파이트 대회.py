def solution(food):
    answer_1 = []
    for i in range(len(food) - 1): # 1부터 시작하는 것을 고려함
        temp = int(food[i + 1]) // 2
        for j in range(temp): 
            answer_1.append(i + 1)
    
    answer_2 = answer_1[::-1]
    answer_1.append(0)
    answer_1 += answer_2
    
    return ''.join(map(str, answer_1))