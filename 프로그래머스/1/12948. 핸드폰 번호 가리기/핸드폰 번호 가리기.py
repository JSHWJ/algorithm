def solution(phone_number):
    num = len(phone_number) - 4
    star = num * "*"
    return star + str(phone_number[-4:])