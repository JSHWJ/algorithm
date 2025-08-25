def solution(num):
    if num == 1:
        return 0
    
    for index in range(500):
        if num % 2 == 0: #짝수라면
            num = num / 2
        else:
            num = num * 3 + 1
        
        if num == 1:
            return index + 1
            
    return -1