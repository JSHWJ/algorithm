def solution(participant, completion):
    completion.sort()
    participant.sort()
    
    for c in range(len(completion)):
        if completion[c] != participant[c]:
            return participant[c]
        
    return participant[len(participant) - 1]