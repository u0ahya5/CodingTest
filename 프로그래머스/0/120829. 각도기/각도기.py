def solution(angle):
    if 0<angle & angle<90:
        return 1
    elif angle==90:
        return 2
    elif 90<angle & angle<180:
        return 3
    elif 180==angle:
        return 4
    else: return -1