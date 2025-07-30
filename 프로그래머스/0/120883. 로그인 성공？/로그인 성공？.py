def solution(id_pw, db):
    input_id, input_pw = id_pw

    for db_id, db_pw in db:
        if input_id == db_id:
            if input_pw == db_pw:
                return "login"
            else:
                return "wrong pw"
    return "fail"
