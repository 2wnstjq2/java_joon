# coding: utf-8

# flask
from flask import Flask
# request param 
from flask import request
# GPIO 
import RPi.GPIO as GPIO
import time
###########################################################

# GPIO 핀번호 할당
GPIO.setmode(GPIO.BOARD)

# pin 번호 chanel
LED = 19
#LED_2= 16
# 핀 설정
GPIO.setup(LED, GPIO.OUT, initial=GPIO.LOW)
#GPIO.setup(LED_2, GPIO.OUT, initial=GPIO.LOW)

# PWM 객체 생성 : 11번 핀, 주파수 - 100Hz
p_1 = GPIO.PWM(LED, 100)
#p_2= GPIO.PWM(LED_2, 100)

# PWM 신호 출력
p_1.start(0)
#p_2.start(0)
def change_duty_1(c):
    p_1.ChangeDutyCycle(c)
    
#def change_duty_2(c):
#    p_2.ChangeDutyCycle(c)




####################################################

app = Flask(__name__)

@app.route('/')



def index():
   
   while 1:
       dc=[10,20,30,40,50]
       for value in dc:
   
            value =  request.args.get('value', '0')
            #val_2 = request.args.get('val_2', '0')
    
            change_duty_1(int(value))
            time.sleep(1)
    #change_duty_2(int(val_2))
    
            return value
     

if __name__ == '__main__':
    # host
    # 로컬 테스트 시에는 개발하는 PC의 IP로 설정
    # 라즈베리파이 에서 실행을 할 경우 라즈베리파이 IP를 설정
    app.run(host='192.168.0.68', port='5000')