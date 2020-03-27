

# 1.list에 추가할 dbject 만드는 함수
def makeStudent(name, kor, math):
    return {
        'name':name,
        'korean':kor,
        'math':math
    }

#데이터 저장용 list 선언, 데이타 입력
student = [
    makeStudent('park', 87, 82),
    makeStudent('jun', 45, 11),
    makeStudent('sub', 98, 77),
    makeStudent('quest', 77, 65)
]

# 출력
print('이름', '총점', '평균', sep='\t')


# 학생리스트 반복 출력
for st in student:
    score_sum = st['korean']+st['math']
    score_avg = (st['korean']+st['math'])/2
    print(st['name'], score_sum, score_avg, sep='\t')
    