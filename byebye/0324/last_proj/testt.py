import time
import sqlite3
from flask import Flask, jsonify,render_template
import dht11
import moisture
import water_sensor
from sunlight import sun_light
app = Flask(__name__)

@app.route('/')
def home():
   
  
   return render_template("mainpage2.html",dht11_now1=dht11.dht_v1(),dht11_now2=dht11.dht_v2(),moisture_now=moisture.moisture_v(),water_sensor_now=water_sensor.water_v(),sun_light_now1=sun_light.sun_light_v1(),sun_light_now2=sun_light.sun_light_v2(),sun_light_now3=sun_light.sun_light_v3()) 

@app.route("/graph") 
def graph(): 
   conn = sqlite3.connect('DB_1.db') #db연결하는 함수

	#conn.row_factory=sqlite3.Row
   c = conn.cursor()
   c.execute("select * from test_2")
   rows = c.fetchall()  #db에 있는값 데이터들을 rows로 가져온다.
   return render_template('graph_2.html',max=40, values=rows) 
	#max는 y값 크기, row값을 values로 받아온다. 현재창 업데이트를 위해 dhtnow가 필요
@app.route("/graph2") 
def graph_2(): 
   conn = sqlite3.connect('DB_1.db') #db연결하는 함수

	#conn.row_factory=sqlite3.Row
   c = conn.cursor()
   c.execute("select * from test_3")
   rows = c.fetchall()  #db에 있는값 데이터들을 rows로 가져온다.
   return render_template('graph_3.html',max=30, values=rows) 

@app.route("/graph3") 
def graph_3(): 
   conn = sqlite3.connect('DB_1.db') #db연결하는 함수

	#conn.row_factory=sqlite3.Row
   c = conn.cursor()
   c.execute("select * from test_4")
   rows = c.fetchall()  #db에 있는값 데이터들을 rows로 가져온다.
   return render_template('graph_4.html',max=1000, values=rows) 
@app.route("/graph4") 
def graph_4(): 
   conn = sqlite3.connect('DB_1.db') #db연결하는 함수

	#conn.row_factory=sqlite3.Row
   c = conn.cursor()
   c.execute("select * from test_5")
   rows = c.fetchall()  #db에 있는값 데이터들을 rows로 가져온다.
   return render_template('graph_5.html',max=350, values=rows) 
	




if __name__=='__main__':
   app.run(host='192.168.0.59',port='5000')
   