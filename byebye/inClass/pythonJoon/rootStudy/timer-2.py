import threading
import datetime

count = 0

def on_timer(count):
    count += 1
    
    print(count)

    timer = threading.Timer(1, on_timer, args=[count])
    timer.start()
    
    if count == 10:
        print('cancling timer..')
        timer.cancel()


print('starting timer..', datetime.datetime.now())

#start
on_timer(count)
