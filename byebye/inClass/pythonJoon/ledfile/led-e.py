# coding: utf-8

# LED 두개 출력

# GPIO 모듈
import RPi.GPIO as GPIO
# time 모듈
import time


# 핀번호 할당으로 처리 : 핀번호 설정 
GPIO.setmode(GPIO.BOARD)

# 핀번호 설정 : chanel
LED_W = 11  # 투명 LED
LED_R = 16  # 빨간색 LED
LED_G = 22  # 초록색 LED


def func_w():
    # 11번 핀 출력 핀으로 등록, 초기 출력은 LOW = 0  False
    GPIO.setup(LED_W, GPIO.OUT)
    print('========> LED_W : ', GPIO.input(LED_W))
    GPIO.output(LED_W, not GPIO.input(LED_W))
    time.sleep(3)

def func_r():
    # 16번 핀 출력 핀으로 등록, 초기 출력은 LOW = 0  False
    
    GPIO.setup(LED_R, GPIO.OUT)
    print('========> LED_W : ', GPIO.input(LED_R))
    GPIO.output(LED_R, not GPIO.input(LED_R))
    time.sleep(3)

def func_g():
    # 22번 핀 출력 핀으로 등록, 초기 출력은 LOW = 0  False
    
    GPIO.setup(LED_G, GPIO.OUT)
    print('========> LED_W : ', GPIO.input(LED_G))
    GPIO.output(LED_G, not GPIO.input(LED_G))
    time.sleep(3)

cnt = 0 
while 1:  
    if(cnt > 8):
        break
    
    func_r()
    time.sleep(3)
    func_g()
    time.sleep(3)
    func_w()
    time.sleep(3)

    cnt += 2
        

GPIO.cleanup()