def solution(x):
    str1 = str(x)
    total = 0
    for i in range(len(str1)):
        total += int(str1[i])
    if x%total == 0:
        return True
    else:
        return False