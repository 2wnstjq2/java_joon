# coding: utf-8

import picamera

import time

import datetime

#picamera Object 생성
with picamera.PiCamera() as camera:
    
    #해상도 선택
    res =int(input('Resolution(1: 350x240, 2: 640x480, 3: 1024x768)'))

    if res == 1:
        camera.resolution = (320, 240)
    elif res == 2:
        camera.resolution = (640, 480)
    else:
        camera.resolution = (1024, 768)

    file_name = input('이름을 적으시오')

    camera.start_preview()
    time.sleep(3)
    camera.stop_preview()

    #활영 저장
    camera.capture(file_name + '.jpg')
