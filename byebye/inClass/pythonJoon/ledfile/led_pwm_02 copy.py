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

#########################################

import tkinter as tk

window = tk.Tk()
#window size
window.geometry('300x300')

#변수설정
led_value = tk.DoubleVar()
led_value.set(0)

#duty 값 변경 함수
def change_duty(dc):
    p_r.ChangeDutyCycle(led_value.get())

#슬라이드 객체 생성
#레이블 (led 밝기 조정), 숫자범위( 0~100 )
slide = tk.Scale(
    window, 
    label='led 밝기 조정', 
    orient='h', 
    from_=0, 
    to=100, 
    variable=led_value, 
    command=change_duty())

slide.pack()

window.mainloop()



#p.PWM 정지
p_r.stop()

#GPIO 개방
GPIO.cleanup()