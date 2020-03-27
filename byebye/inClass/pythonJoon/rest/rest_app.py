
#모듈읽기
from flask import Flask, jsonify, abort, make_response

# 서버생성
app = Flask(__name__)

# 서버에 들어가면 나오는 첫페이지
@app.route('/')
def index():
    return '<h1>hi~</h1>'

# 이 경로에 따라 무엇을 할지 정함
@app.route('/rest/v1/data', methods = ['GET'])
def data_get():
    
    data_dic =[{
        'id':'cool',
        'name':'COOL',
        'pw':'asdf1234'
        },{
        'id':'cool',
        'name':'COOL',
        'pw':'asdf1234'
    }]

    # json으로 변환
    return jsonify({'members':data_dic})

# like 패스배리어블 : <int:led_id>번호에 따라 다른 정보(or 페이지)가 나옴
@app.route('/rest/v1/leds/<int:led_id>', methods = ['GET'])
def led_get(led_id):
    
    data_dic = {'led_no':led_id}

    if led_id > 9:
        abort(404)

    # json으로 변환
    return jsonify(data_dic)

@app.errorhandler(404)
def not_found(error):
    return make_response(jsonify({'error':'not used led Number'}), 404)


if __name__ == '__main__':
    app.run(debug=True)
