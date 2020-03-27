import time



# while True:
#     if moisture.moisture_v()<=20:
#         water_pump.write(1) #m<=10, 'ON'
#         time.sleep(1)
#         water_pump.write(0) #after, 'OFF' -> once 'ON'
#     elif moisture.moisture_v()>20:
#         water_pump.write(0) #m>10, 'OFF'
#     time.sleep(1)
#     print(moisture.moisture_v())

li_a = []

for i in range(0,18,3): #0 3 6 9 12 15
    if i%2==0:
        li_a.append(i*i)
        
        time.sleep(1)
    else:
        li_a.append(2*i)

print(li_a)

