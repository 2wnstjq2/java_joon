from dht11 import getDht
from moisture import getData
from water_sensor import getdata
from sun_light import getSun


def strMerge():
    dht = getDht()
    moisture = getData()
    water = getdata()
    sun = getSun()
    
    result = dht +'  \n  '+ moisture +'  \n  '+ water + '  \n  ' + sun
    return result

