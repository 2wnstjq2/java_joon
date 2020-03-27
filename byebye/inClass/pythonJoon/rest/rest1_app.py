#모듈읽기
from flask import Flask, jsonify, abort, make_response
from flask_restful import Api, Resource

# sqlite3 연결
import sqlite3

# DB 연결
# con = sqlite3.connect('sample')
con = sqlite3.connect('sample', check_same_thread=False)
cur = con.cursor()


# 서버생성
app = Flask(__name__)
api = Api(app)

class LedApi(Resource):
    def get(self, led_no):

        cur = con.cursor()
        sql_select = 'select * from user_table'
        cur.execute(sql_select)
        
        result_data = {}

        while True:
        # 하나씩 가져온다
            row = cur.fetchone() #반환행이 없으면 none 반환
            if row == None:
                break
            result_data = {
                'id':row[0],
                'name':row[1],
                'email':row[2],
                'birthday':row[3]
            }

        return result_data
    


    def post(self, led_no):
        return {'type':'POST'}
    def put(self, led_no):
        return {'type':'PUT'}
    def delete(self, led_no):
        return {'type':'DELETE'}

api.add_resource(LedApi, '/rest/v2/leds/<led_no>')


if __name__ == '__main__':
    app.run(debug=True)