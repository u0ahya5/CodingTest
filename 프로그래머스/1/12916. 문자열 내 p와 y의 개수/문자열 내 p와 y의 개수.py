def solution(s):
    answer = s.lower()
    p_count = 0
    y_count = 0
    for i in range(len(s)):
        if "p" in answer[i]:
            p_count += 1
        if "y" in answer[i]:
            y_count += 1
    if p_count == y_count:
        return True
    else:
        return False