#함수정의 매개변수로 전달받은 데이터의 제곱의 연산값을 변환하는 함수

def power(item):
    return item*item

#전달받은 데이터를 3과 비교해서 작은 값일때 true 반환하는 함수

def under_3(it):
    return it < 3

li_inA = [1,2,3,4,5]

output_a = map(power, li_inA)

print('map(power, li_inA):',output_a)
print('map(power, li_inA):',list(output_a))


output_b = filter(under_3, li_inA)

print(output_b)
print(list(output_b))

print('----------lambda사용-----------')

pow = lambda x: x*x
und = lambda x: x<3

output_A = map(pow, li_inA)

print('map(pow, li_inA):',output_A)
print('map(pow, li_inA):',list(output_A))


output_B = filter(und, li_inA)

print(output_B)
print(list(output_B))