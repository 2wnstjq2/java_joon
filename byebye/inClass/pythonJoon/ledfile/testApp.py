# coding: utf-8

# flask
from flask import Flask

# request param
from flask import request

from flask_cors import CORS

#GPIO 라리브러리 호출
import RPi.GPIO as GPIO

######################

#핀번호 할당 -> 커넥터 핀 번호로 지정
GPIO.setmode(GPIO.BOARD)

#사용할 핀번호 : chanel번호
LED_W = 11  # 투명 LED
LED_R = 16  # 빨간색 LED
LED_G = 22  # 초록색 LED

# 핀 설정 - 출력 핀으로 등록, 초기 출력은 LOW = 0  False
GPIO.setup(LED_W, GPIO.OUT, initial=GPIO.LOW)
GPIO.setup(LED_R, GPIO.OUT, initial=GPIO.LOW)
GPIO.setup(LED_G, GPIO.OUT, initial=GPIO.LOW)

#PWM 객체 생성 : 11번 핀, 주파수 - 100Hz
p_r = GPIO.PWM(LED_R, 100)
p_w = GPIO.PWM(LED_W, 100)
p_g = GPIO.PWM(LED_G, 100)

#PWM 신호 출력
p_r.start(0)
p_w.start(0)
p_g.start(0)

#duty 값 변경 함수
def change_duty(dc):
    p_r.ChangeDutyCycle(dc)
    p_w.ChangeDutyCycle(dc)
    p_g.ChangeDutyCycle(dc)

##################

app = Flask(__name__)

CORS(app)

@app.route('/')
def index():

    led = request.args.get('led', 'g')
    p_val = request.args.get('p_val', '0')
    
    change_duty(int(p_val))

    return led + ' : ' + p_val

if __name__ == '__main__':
    # host
    # 로컬 테스트 시에는 개발하는 PC의 IP로 설정
    # 라즈베리파이 에서 실행을 할 경우 라즈베리파이 IP를 설정
    app.run(host='192.168.0.68', port='5000')