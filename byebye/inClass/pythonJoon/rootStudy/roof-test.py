
print("# 무한반복")
while True:
     print(".", end="\n")
     break # 여기 없으면 계속 ......... 써짐

print("-------------------------")

i=0
while i<3:
    print("{}번째".format(i))
    i=i+1
    
print("-------------------------")

li_b = [1,2,3,1]
val=1
while val in li_b:
     li_b.remove(val)
# 리스트안에서 계속 반복하며 1 제거
print(li_b)

print("-------------------------")

import time

# 처리횟수 카운트 변수
num = 0

# 현재보다 5s 앞선 시간
target_tick = time.time() + 5 #(60*60)

# 5s간 반복
while time.time() < target_tick:
     num = num+1

print("5s동안 {}번 반복".format(num))