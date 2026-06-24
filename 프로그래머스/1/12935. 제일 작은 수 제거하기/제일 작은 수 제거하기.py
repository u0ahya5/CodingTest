def solution(arr):
    minn = arr[0]
    temp = 0
    for i in range(len(arr)):
        if minn > arr[i]:
            minn = arr[i]
            temp = i
    arr.pop(temp)
    if len(arr) == 0:
        return [-1]
    return arr