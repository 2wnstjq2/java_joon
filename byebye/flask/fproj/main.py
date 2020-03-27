from flask import Flask, render_template, request
import sqlite3
from flask_restful import Api

# #db연결
con = sqlite3.connect('sample', check_same_thread=False)


app = Flask(__name__)

def asf():
    return 'asd'

def sa():
    return 'dsa'


@app.route('/')
def index():

    a =asf()
    b =sa()
    
    c = a +'\n'+ b

    return render_template('main/index.html', aa= c)


@app.route('/jun')
def CaS():
    cur = con.cursor()
    sql_select = 'select * from user_table'

    #sql실행
    cur.execute(sql_select)

  
    result_data = cur.fetchone()



    
    return render_template('main/index_f.html', dt=result_data)





if __name__ == '__main__':
    app.run(debug=True)