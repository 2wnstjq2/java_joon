import time
import sqlite3
from flask import Flask, jsonify,render_template
import dht11 
import moisture
from sunlight import sun_light
import water_sensor

app = Flask(__name__)

@app.route('/')
def home():
  
    return render_template("mainpage.html",
    dht11_now1=dht11.dht_v1(),
    dht11_now2=dht11.dht_v2(),
    moisture_now=moisture.moisture_v(),
    sun_light_now1=sun_light.sun_light_v1(),
    sun_light_now2=sun_light.sun_light_v2(),
    sun_light_now3=sun_light.sun_light_v3(),
    water_sensor_now=water_sensor.water_v()) 
@app.route("/graph") 
def graph(): 
   
   conn = sqlite3.connect('DB_1.db') #db연결하는 함수
	#conn.row_factory=sqlite3.Row
   c = conn.cursor()
   c.execute("select * from test_1")
   rows = c.fetchall()  #db에 있는값 데이터들을 rows로 가져온다.
   return render_template('graph_2.html',max=40, values=rows) 


if __name__=='__main__':
    app.run(host='192.168.0.59',port='5000')