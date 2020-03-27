
from flask import Flask, jsonify,render_template

app = Flask(__name__)

@app.route('/')
def home():
    import arduino_copy_jun

    return render_template("bin.html")

@app.route('/jun')
def test():
    

    return render_template("linechart.html")


if __name__=='__main__':
    app.run(host='192.168.0.68',port='5000')