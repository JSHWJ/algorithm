def solution(a, b, n):
    # 2개를 주면 1개를 반환해주는 것 , a를 주면 b병을 준다.
    answer = 0
    total = n
    
    while(total >= a):
        answer += total // a * b
        total = total // a * b + total % a
        print(total)
        
    return answer