
from flask import Flask, jsonify,render_template
import qqs

app = Flask(__name__)

@app.route('/')
def home():
    return render_template("main/index.html")

@app.route('/run')
def run():
    qqs.wow()
    return render_template("main/index2.html")


if __name__ == '__main__':
    app.run(debug=True)