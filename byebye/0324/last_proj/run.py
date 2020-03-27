from pyfirmata import Arduino, util
import moisture


ardu = Arduino('/dev/ttyACM0')

run = ardu.get_pin('d:8:o')

while True:
    
    run.write(1)

