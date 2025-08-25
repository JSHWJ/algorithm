import math

def solution(n):
    answer = int(n ** 0.5)
    if answer * answer == n:
        return int((answer+1) * (answer+1))
    else:
        return -1