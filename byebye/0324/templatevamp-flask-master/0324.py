import time
import sqlite3
import json
from flask import Flask,render_template,request,Markup

app= Flask(__name__)
app.config.from_object(__name__)

conn = sqlite3.connect('DB_30.db')
c = conn.cursor()
c.execute("select * from score")
rows = c.fetchall()

@app.route('/data.lee')
def ftest_1():
        

    return json.dumps(rows)
    

@app.route("/charts") 
def graph(): 
    

    return render_template('linechart.html',max=30, labels=rows, values=rows) 

if __name__=='__main__':
    app.run(debug=True)