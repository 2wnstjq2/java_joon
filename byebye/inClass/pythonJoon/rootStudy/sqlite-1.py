    # sqlite3 연결
import sqlite3

    # DB 연결
con = sqlite3.connect('sample')
# connect(host='localhost',
# port=3306,
# user='root',
# passwd='your_password',
# db='your_dbname',
# charset='utf8')



cur = con.cursor()

    # SQL query 작성
sql_select = 'select * from user_table'
# sql= """CREATE TABLE test_table(
#          idx  INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
#          name VARCHAR(256) NOT NULL,
#          nick VARCHAR(256) NOT NULL
#          );"""

    # SQL query 실행
cur.execute(sql_select)

print('아이디\t이름\t이메일\t\t생일')

while True:
    # 하나씩 가져온다
    row = cur.fetchone() #반환행이 없으면 none 반환
    if row == None:
        break
    print('{}\t{}\t{}\t{}'.format(row[0], row[1], row[2], row[3]))


#변화적용
con.commit()

con.close()

