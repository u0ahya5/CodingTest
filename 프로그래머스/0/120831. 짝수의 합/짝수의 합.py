def solution(n):
    sum = 0
    answer = 0
    for i in range(0, n+1):
        if i%2==0:
            sum += answer + i
    return sum