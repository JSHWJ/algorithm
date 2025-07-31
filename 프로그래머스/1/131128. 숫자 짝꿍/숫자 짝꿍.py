from collections import Counter

def solution(X, Y):
    x_list = list(X) 
    y_list = list(Y)

    x_counter = Counter(x_list)
    y_counter = Counter(y_list)

    answer = []

    for i in range(10):
        digit = str(i)
        if digit in x_counter and digit in y_counter:
            answer += [digit] * min(x_counter[digit], y_counter[digit]) 

    if not answer:
        return "-1"
    if all(d == '0' for d in answer):
        return "0"

    answer.sort(reverse=True)
    return ''.join(answer)