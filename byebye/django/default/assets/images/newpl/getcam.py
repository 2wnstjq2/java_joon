# coding: utf-8

import picamera
import time
import datetime

# picamera Object 생성
with picamera.PiCamera() as camera:

    # 해상도 설정
    camera.resolution = (320, 240)

    now = datetime.datetime.now()

    
    file_name = '{} {}.png'.format(
        now.month, now.day
    )
    
    # 촬영 -> 저장
    camera.capture(file_name)