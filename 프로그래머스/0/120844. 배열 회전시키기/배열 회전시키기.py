def solution(numbers, direction):
    answer = []
    tmp = numbers[0]
    if direction == "right":
        answer = numbers[-1:] + numbers[:-1]
    else:
        answer = numbers[1:] + numbers[:1]
    return answer