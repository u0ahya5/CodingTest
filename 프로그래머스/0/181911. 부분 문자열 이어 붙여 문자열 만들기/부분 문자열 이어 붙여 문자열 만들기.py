def solution(my_strings, parts):
    answer = ''
    for i in range(len(parts)):
        str1, str2 = parts[i]
        answer += my_strings[i][str1:str2+1]
    return answer