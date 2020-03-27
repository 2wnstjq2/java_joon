import sqlite3
from flask import Flask, jsonify,render_template


from sensor import getdt
from hat_insert import gethum

app = Flask(__name__)
con = sqlite3.connect('DB_30.db')
cur = con.cursor()
cur.execute("select * from score")
rows = cur.fetchall()

@app.route('/')
def home():
    return render_template("hello.html",dht11=getdt.strMerge())


@app.route("/graph") 
def graph():     
    return render_template('linechart.html',max=30, rows=rows) 



if __name__=='__main__':
    app.run(host='192.168.0.68',port='5000')