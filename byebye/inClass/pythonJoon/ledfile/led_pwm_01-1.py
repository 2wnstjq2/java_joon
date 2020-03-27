#coding: utf-8

#gpio 라리브러리 호출
import RPi.GPIO as GPIO

#time 호출 - sleep
import time

#핀번호 할당 -> 커넥터 핀 번호로 지정
GPIO.setmode(GPIO.BOARD)

#사용할 핀번호 : chanel번호
LED_W = 11  # 투명 LED
LED_R = 16  # 빨간색 LED
LED_G = 22  # 초록색 LED

#밝기 목록 ( 0.0 ~ 100 )
dc = [0,1,2,3,4,5,6,7,8,9,10,12,13,15,20,30,50,70,100]

# 핀 설정 - 출력 핀으로 등록, 초기 출력은 LOW = 0  False
GPIO.setup(LED_R, GPIO.OUT, initial=GPIO.LOW)

#PWM 객체 생성 : 11번 핀, 주파수 - 100Hz
p = GPIO.PWM(LED_R, 100)

#PWM 신호 출력
p.start(0)

while 1:
    for value in dc:
        #밝기 변경
        p.ChangeDutyCycle(value)
        time.sleep(0.3)

        dc.reverse()
        time.sleep(0.3)


#p.PWM 정지
p.stop()

#GPIO 개방
GPIO.cleanup()