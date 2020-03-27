class Student:
    def study(self):
        print('열공')

class Teacher:
    def teach(self):
        print('열지도')


list_temp = [Student(),Student(),Student(),Student(),Teacher(),Student()]

for member in list_temp:
    if isinstance(member, Student):
        member.study()
    elif isinstance(member, Teacher):
        member.teach()
    else:
        print('get out!!!!!!')

# 인스턴스 (객체) 생성
student = Student()

# class타입 확인
print(isinstance(student, Student))