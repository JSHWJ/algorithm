def solution(emergency):
    answer = []
    
    emergency_sorted = sorted(emergency, reverse = True)
    
    for a in range(len(emergency)):
        for i in range(len(emergency_sorted)):
            if emergency[a] == emergency_sorted[i]:
                answer.append(i+1)
        
    return answer