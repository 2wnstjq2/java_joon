# dml : insert, update, delete
import sqlite3

# DB연결
con = sqlite3.connect('sample')
cur = con.cursor()

# sql실행 = table생성
sql_insert = 'insert into user_table values (\'son\', \'son\', \'son@naver.com\', 1991)'
cur.execute(sql_insert)
# cur.execute('insert into user_table values (\'son\', \'son\', \'son@naver.com\', 1991)')
# cur.execute("INSERT INTO kakao VALUES('16.06.03', 97000, 98600, 96900, 98000, 321405)")

#변화적용
con.commit()

con.close()