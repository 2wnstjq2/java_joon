# coding: utf-8

import tkinter as tk

#gpio 라리브러리 호출
import RPi.GPIO as GPIO

#time 호출
import time

#핀번호로 제어 : 핀번호 할당 -> 커넥터 핀 번호로 지정
GPIO.setmode(GPIO.BOARD)

#사용할 핀번호 : chanel번호
LED_W = 19

#11번 채널(핀번호)를 출력 핀으로 등록, 초기 출력은 LOW = 0 False
GPIO.setup(LED_W, GPIO.OUT, initial=GPIO.LOW)

print('========>led-w :', GPIO.input(LED_W))

def func():
    GPIO.output(LED_W, not GPIO.input(LED_W))
    time.sleep(3)
    
# 윈도우 객체
window = tk.Tk()
window.geometry('400x400')

#label 객체 생성
Label = tk.Label(window, text='버튼을 눌러 LED점등을 하세요')

#버튼
btn = tk.Button(window, text='LED_W', command=func)

Label.pack()
btn.pack()

#윈도우 출력
window.mainloop()

#GPIO 개방
GPIO.cleanup()

