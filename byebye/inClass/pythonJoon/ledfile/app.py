#coding : utf-8

#외부에서 보기가능!

#flask 모듈읽기
from flask import Flask

from flask import CORS

#GPIO 모듈
import RPi.GPIO as GPIO

#pin번호 할당
GPIO.setmode(GPIO.BOARD)

#사용할 핀번호 : chanel번호
LED_W = 11  # 투명 LED
LED_R = 16  # 빨간색 LED
LED_G = 22  # 초록색 LED

GPIO.setup(LED_W, GPIO.OUT, initial=GPIO.LOW)
GPIO.setup(LED_R, GPIO.OUT, initial=GPIO.LOW)
GPIO.setup(LED_G, GPIO.OUT, initial=GPIO.LOW)

def func_w():
    
    if not GPIO.input(LED_W):
        fun_clear()

    GPIO.output(LED_W, not GPIO.input(LED_W))

    return str(GPIO.input(LED_W))
    
def func_r():
    if not GPIO.input(LED_R):
        fun_clear()
    
    GPIO.output(LED_R, not GPIO.input(LED_R))

    return str(GPIO.input(LED_R))

def func_g():
    
    if not GPIO.input(LED_G): # 1: on
        fun_clear()       

    GPIO.output(LED_G, not GPIO.input(LED_G))

    return str(GPIO.input(LED_G))

#채널 값을 0로!
def fun_clear():    
    GPIO.output(LED_G, False)
    GPIO.output(LED_R, 0)
    GPIO.output(LED_W, GPIO.LOW)



####################################################

# 서버생성
app = Flask(__name__)

CORS(app)

# 만들어두고 crud를 ...
@app.route('/sw_g')
def sw_g():
    return func_g()

@app.route('/sw_r')
def sw_r():
    return func_r()

@app.route('/sw_w')
def sw_w():
    return func_w()

print(__name__)
if __name__ == '__main__':
    app.run(host='192.168.0.68', port=5000, debug=False)