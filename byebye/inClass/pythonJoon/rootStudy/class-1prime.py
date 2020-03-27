

# student class 정의
# class Stud:
#     pass

# st_a = Stud()

# 1.list에 추가할 dbject 만드는 함수
def makeStudent(name, kor, math):
    return {
        'name':name,
        'korean':kor,
        'math':math
    }

def student_get_sum(student):
    return student['korean']+student['math']

def student_get_average(student):
    return student_get_sum(student)/2

def student_tostring(student):
    return '{}\t{}\t{}'.format(st['name'], student_get_sum(student), student_get_average(student))

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
    print(student_tostring(st))
    