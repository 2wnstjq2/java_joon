# 부모클래스
class Parent:
    def __init__(self, value):
        self.value=value
        print('부모클래스 생성자 호출')

    def test(self):
        print('부모클래스의 test()메서드 호출')

# 자식클래스
class Child(Parent):
    # 생성자
    def __init__(self, value):
        Parent.__init__(self, value)
        print('자식클래스 생성자 호출')

    def test(self):
        print('자식클래스의 test()메서드 호출')

    def __str__(self):
        return str(self.value)

    def test1(self):
        print('자식클래스의 test1()메서드 호출')


child = Child(10)
child.test()
print(child.value)

print(isinstance(child, Parent))
print(isinstance(child, Child))

print(child)

child.test1()
