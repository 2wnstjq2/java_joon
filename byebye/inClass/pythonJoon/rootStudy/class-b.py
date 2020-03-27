# circle 클래스 생성
# 속성(변수) : 반지름 -> radious, 외부에서 속성을 참조하지 못하도록 보호
# 기능(메서드) : 원의 둘레와 넓이

class circle:
    # 생성잦
    def __init__(self, radious):
        self.radious = radious

#getter : __radious
def set_radious(self, value):
    self.__radious=value

# 인스턴스센성
c_1 = circle(10)

# 셋터 메서드를 통해서 변수에 변화주기
print(c_1.get_radious)
