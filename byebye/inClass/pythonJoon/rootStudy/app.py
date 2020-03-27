# 모듈읽기
from flask import Flask

# 서버등록(생성)
app = Flask(__name__)

@app.route('/')
def hello():
    return "<h1>hello pyton</h1>"