def solution(n):
    answer = []
    reversed_answer = reversed(str(n))
    for i in reversed_answer:
        answer.append(int(i))
    return answer
