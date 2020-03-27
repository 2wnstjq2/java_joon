# 변수
PI = 3.14

# fx 사용자의 데이터 입력값을 반환하는 기능
def num_input():
    reslt = input('숫자를 입력하시오.>>')
    return float(reslt)

# fx 원의 둘레
def get_circle(rad):
    return 2*PI*rad

# fx 원의 면적
def get_ccarea(rad):
    return PI*rad*rad

if __name__ == '__main__':
    print(__name__)
    print(get_ccarea(10))