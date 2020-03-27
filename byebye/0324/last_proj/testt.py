import time
import sqlite3
from flask import Flask, jsonify,render_template
import dht111
import moisture

app = Flask(__name__)

@app.route('/')
def home():
   
  
   return render_template("mainpage2.html",dht11_now1=dht111.dht_v1(),dht11_now2=dht111.dht_v2(),moisture_now=moisture.moisture_v(),) 

@app.route("/graph") 
def graph(): 
   conn = sqlite3.connect('DB_1.db') #db연결하는 함수

	#conn.row_factory=sqlite3.Row
   c = conn.cursor()
   c.execute("select * from test_1")
   rows = c.fetchall()  #db에 있는값 데이터들을 rows로 가져온다.
   return render_template('graph_2.html',max=30, values=rows) 
	#max는 y값 크기, row값을 values로 받아온다. 현재창 업데이트를 위해 dhtnow가 필요




if __name__=='__main__':
   app.run(host='192.168.0.68',port='5000')
   