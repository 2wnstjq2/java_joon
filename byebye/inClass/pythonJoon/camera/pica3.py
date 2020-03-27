# coding: utf-8

import picamera
5
import time

import datetime

#picamera Object 생성
with picamera.PiCamera() as camera:
    
#해상도 선택
    camera.resolution = (320, 240)

    now = datetime.datetime.now()
        
    file_name = '{}{}{}{}{}{}{}.jpg'.format(
        now.year, now.month, now.day, now.hour, now.minute, now.second, now.microsecond
    )

#활영 저장
    camera.capture(file_name)
