def solution(babbling):
    words = ["aya", "ye", "woo", "ma"]
    num = 0
    
    for b in babbling:
        print(b)
        for w in words:
            b = b.replace(w, " ")
        b = b.replace(" ", "")
        if b == "":
            print(b)
            num += 1
            
            
    return num