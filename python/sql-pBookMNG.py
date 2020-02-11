# sqlite3 연결
import sqlite3

# DB 연결
con = sqlite3.connect('phonebook')
cur = con.cursor()

# 데이터 기입
name = input('이름을 입력하세요 :')
phonenumber = input('전화번호을 입력하세요 :')
birthday = input('생일을 입력하세요 :')

# 데이터 저장
sql = 'insert into bookTable values (\'{}\',\'{}\' ,\'{}\')'.format(name, phonenumber, birthday)
cur.execute(sql)

sql_select = 'select * from bookTable'

cur.execute(sql_select)

print('이름\t전화번호\t생일')

while True:
        # 하나씩 가져온다
        row = cur.fetchone() #반환행이 없으면 none 반환
        if row == None:
            break
        print('{}\t{}\t\t{}'.format(row[0], row[1], row[2]))



con.commit()
con.close()
