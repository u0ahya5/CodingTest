def solution(num_list):
    answer1 = 0
    answer2 = 0
    for i in range(0, len(num_list), 2):
        answer1 += num_list[i]
    for i in range(1, len(num_list), 2):
        answer2 += num_list[i]
    if answer1 >= answer2:
        return answer1
    else:
        return answer2