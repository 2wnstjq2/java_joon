import sqlite3
from flask import Flask, jsonify,render_template



app = Flask(__name__)

@app.route('/')
def home():
    return render_template("bin.html",dht11=dht)




if __name__=='__main__':
    app.run(host='192.168.0.68',port='5000')