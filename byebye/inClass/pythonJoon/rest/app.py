from flask import Flask, jsonify
import flask

app = Flask(__name__)

count = 0

@app.route('/')
def home():
    global count
    count += 1
    return jsonify(
        text='hi~',
        count=count
        )