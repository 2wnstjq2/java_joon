from pyfirmata import Arduino, util
import time

import dht11 as dht


ardu = Arduino('/dev/ttyACM0')

green = ardu.get_pin('d:8:o') # input: dht11


while True:
    #input = ardu.get_pin('d:8:i')
    

    king = float(dht.dht_v2()) #float type change
    print(king)

    if king>25: 
        green.write(1)

    else:
        green.write(0)

        
    time.sleep(1)


