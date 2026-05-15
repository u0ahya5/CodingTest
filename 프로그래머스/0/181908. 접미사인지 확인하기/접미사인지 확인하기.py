def solution(my_string, is_suffix):
    answer = 0
    if my_string.endswith(is_suffix):
        return 1
    else:
        return 0