import threading
import datetime

count = 0

# call back function
def func_a():
    global count
    print('Timer expired')
    print('end time : ', datetime.datetime.now(), '\t횟수 :', count)
    
    if count == 10:
        return
    
    count += 1

    # 재귀함수 -> 무한히 반복
    threading.Timer(3, func_a).start()

print('start time : ', datetime.datetime.now())

# after 3s start
threading.Timer(3, func_a).start()
