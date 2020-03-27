#coding : utf-8

import tkinter as tk

#gpio 라리브러리 호출
import RPi.GPIO as GPIO

#time 호출
import time

#핀번호로 제어 : 핀번호 할당 -> 커넥터 핀 번호로 지정
GPIO.setmode(GPIO.BOARD)

#사용할 핀번호 : chanel번호
LED_W = 11  # 투명 LED
LED_R = 16  # 빨간색 LED
LED_G = 22  # 초록색 LED

# 11번 핀 출력 핀으로 등록, 초기 출력은 LOW = 0  False
GPIO.setup(LED_W, GPIO.OUT, initial=GPIO.LOW)
GPIO.setup(LED_R, GPIO.OUT, initial=GPIO.LOW)
GPIO.setup(LED_G, GPIO.OUT, initial=GPIO.LOW)

def func_w():
    
    if GPIO.input(LED_W): # 1: on
        btn_w.configure(text='(노랑이 on)')
        
    else:  #0 : off
        fun_clear()
        btn_w.configure(text='(노랑이 off)')

    GPIO.output(LED_W, not GPIO.input(LED_W))
    
def func_r():
    
    if GPIO.input(LED_R): # 1: on
        btn_r.configure(text='(빨강이 on)')
        
    else:  #0 : off
        fun_clear()
        btn_r.configure(text='(빨강이 off)')

    GPIO.output(LED_R, not GPIO.input(LED_R))

def func_g():
    
    if GPIO.input(LED_G): # 1: on
        btn_r.configure(text='(초록이 on)')
        
    else:  #0 : off
        fun_clear()
        btn_g.configure(text='(초록이 off)')

    GPIO.output(LED_G, not GPIO.input(LED_G))


#채널 값을 0로!
def fun_clear():    
    GPIO.output(LED_G, 0)
    GPIO.output(LED_R, 0)
    GPIO.output(LED_W, GPIO.LOW)
    btn_w.configure(text='(노랑이 on)')
    btn_g.configure(text='(초록이 on)')
    btn_r.configure(text='(빨강이 on)')


    
# 윈도우 객체
window = tk.Tk()
window.geometry('400x400')

#label 객체 생성
Label = tk.Label(window, text='버튼을 눌러 LED점등을 하세요')

#버튼
btn_g = tk.Button(window, text='초록이 on', command=func_g)
btn_r = tk.Button(window, text='빨강이 on', command=func_r)
btn_w = tk.Button(window, text='노랑이 on', command=func_w)

Label.pack()
btn_g.pack()
btn_r.pack()
btn_w.pack()

#윈도우 출력
window.mainloop()

#GPIO 개방
GPIO.cleanup()

