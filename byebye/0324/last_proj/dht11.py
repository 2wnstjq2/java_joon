import time
import seeed_dht
import sqlite3 # DB 저장을 위해 import 
from datetime import datetime # 현재 시간 저장을 위해 import

def dht11():    # for DHT11/DHT22
    sensor = seeed_dht.DHT("11", 12)
    # for DHT10
    # sensor = seeed_dht.DHT("10")

    while True:
        humi, temp = sensor.read()
        if not humi is None:
            print('DHT{0}, humidity {1:.1f}%, temperature {2:.1f}*'.format(sensor.dht_type, humi, temp))
        else:
            print('DHT{0}, humidity & temperature: {1}'.format(sensor.dht_type, temp))
        time.sleep(1)
        
def getDht():
    sensor = seeed_dht.DHT("11", 12)
    humi, temp = sensor.read()
    result = ''
    if not humi is None:
        result = 'DHT{0}, humidity {1:.1f}%, temperature {2:.1f}*'.format(sensor.dht_type, humi, temp)
    else:
        result = 'DHT{0}, humidity & temperature: {1}'.format(sensor.dht_type, temp)

    return result

#빨간줄떠도 구동 잘됨 테스트 해봤습니다.

def dht_v1():
    sensor = seeed_dht.DHT("11", 12)
    humi, temp = sensor.read()
    
    now = datetime.now().strftime('%H:%M:%S')    #시간
    Dtime=str(now) #현재시간
    con = sqlite3.connect('DB_1.db') # db연결 DB_1.db파일과 테이블은 미리 제가 DB.make로 만들어 놨습니다!!
    cur = con.cursor() 
    sql_insert = "insert into test_1 values('{}', '{}','{}')".format(Dtime,humi, temp) #저장은 시간을 맞쳐주기위해 한꺼번에 사실상 큰차이도 없으니 괜찮다고 봅니다.
    cur.execute(sql_insert)
    con.commit()
    result = '{}'.format(humi)
    return result

def dht_v2():
    sensor = seeed_dht.DHT("11", 5)
    humi, temp = sensor.read()
    result = ''
   
    result = '{}'.format(humi)
    return result

