#coding : utf-8

#gpio 라리브러리 호출
import RPi.GPIO as GPIO

#time 호출
import time

#핀번호로 제어 : 핀번호 할당 -> 커넥터 핀 번호로 지정
GPIO.setmode(GPIO.BOARD)

#사용할 핀번호 : chanel번호
LED_W = 11

#11번 채널(핀번호)를 출력 핀으로 등록, 초기 출력은 LOW = 0 False
GPIO.setup(LED_W, GPIO.OUT, initial=GPIO.LOW)

print('========>led-w :', GPIO.input(LED_W))

def func():
    GPIO.output(LED_W, not GPIO.input(LED_W))
    time.sleep(3)
    
cnt = 0

while 1:
    if(cnt>10):
        break

func()

print('========>led-w :', GPIO.input(LED_W))

GPIO.cleanup()
#하이레벨 출력
# GPIO.output(LED_W, 1)

#로우레벨 출력
# GPIO.output(LED_W, GPIO.LOW)

