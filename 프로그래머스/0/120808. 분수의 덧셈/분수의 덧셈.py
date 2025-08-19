import math 

def solution(numer1, denom1, numer2, denom2):
    answer = []
    deno = denom1 * denom2 # 분모
    numer = denom1 * numer2 + denom2 * numer1
    
    gcd = math.gcd(deno, numer)
    
    answer.append(numer/gcd)
    answer.append(deno/gcd)
    return answer