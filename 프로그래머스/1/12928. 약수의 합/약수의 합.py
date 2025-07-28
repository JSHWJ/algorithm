import math

def solution(n):
    answer = 0
    for r in range(1, int(math.sqrt(n)) + 1):
        if n % r == 0:
            answer += r
            if r != (n / r):
                answer += (n / r)
    return answer