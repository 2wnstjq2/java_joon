# 모듈 호출
# 날짜 시간 관련 모듈
import datetime

# 현재 시간 구하기
now = datetime.datetime.now()

# print(now)

if 12<now.hour<13:
    print("지금은 점심시간입니다")

else: 
    print("공부하자")
