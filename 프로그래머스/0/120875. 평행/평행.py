def solution(dots):
    def get_slope(dot1, dot2):
        x1, y1 = dot1[0], dot1[1]
        x2, y2 = dot2[0], dot2[1]
        return (y2 - y1) / (x2 - x1)

    cases = [
        [0, 1, 2, 3],
        [0, 2, 1, 3],
        [0, 3, 1, 2],
    ]

    for case in cases:
        a = dots[case[0]]
        b = dots[case[1]]
        c = dots[case[2]]
        d = dots[case[3]]
        if get_slope(a, b) == get_slope(c, d):
            return 1
    return 0