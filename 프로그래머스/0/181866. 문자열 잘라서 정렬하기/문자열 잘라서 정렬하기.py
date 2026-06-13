def solution(myString):
    answer = []
    arr = []
    arr += myString.split("x")
    for i in range(len(arr)):
        if arr[i] != "":
            answer.append(arr[i])
    answer.sort()
    return answer