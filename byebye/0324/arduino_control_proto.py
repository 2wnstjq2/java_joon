from pyfirmata import Arduino, util
import time
import water_sensor
from sunlight import sun_light
import dht11 as dht
import moisture


ardu = Arduino('/dev/ttyACM0')

#input = ardu.get_pin('d:8:i')
fan_led = ardu.get_pin('d:8:o') # input: dht11
water_pump = ardu.get_pin('d:13:o') # moisture sensor
led_12v = ardu.get_pin('d:7:o') #sunlight sensor
red_led = ardu.get_pin('d:10:o') #water sensor

#시리얼 값 반복 + 반복자 스레드
st = util.Iterator(ardu)
st.start()
#input 리포팅 활성화
#input.enable_reporting()

while True:
    
    # Sunlight sensor
    v = sun_light.sun_light_v()
    vv = float(v[2])
    if vv<=0.05:
        led_12v.write(1) #uvIndex<=0.05, 'ON'
    elif vv>0.05:
        led_12v.write(0) #uvIndex>0.05, 'OFF'
    print('sun: \t\tG', vv)
    time.sleep(1)
    
    # Moisture sensor
    if moisture.moisture_v()<=10:
        water_pump.write(1) #m<=10, 'ON'
        water_pump.write(0) #after, 'OFF' -> once 'ON'
    elif moisture.moisture_v()>10:
        water_pump.write(0) #m>10, 'OFF'
    time.sleep(1)
    print('moisture:\tR', moisture.moisture_v())
    
    # dht11
    king1 = float(dht.dht_v1()) #float type change
    king2 = float(dht.dht_v2()) #float type change
    if king1>=60 or king2>23: 
        fan_led.write(1) #humi>=60, temp>=23 'ON'
        print('dht11: yes \tB',king1, king2)
    elif king1<60 or king2<=23:
        fan_led.write(0) #humi<60, temp<23 'OFF'
        print('dht11: no \tB',king1, king2)
    time.sleep(1)

    # water sensor
    if water_sensor.water_v()> 500:
        red_led.write(1)        
    else:
        red_led.write(0)
    time.sleep(1)
    print('water_sensor: \tW', water_sensor.water_v())

    
    


       
        
    
    