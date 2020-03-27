import sqlite3
con = sqlite3.connect('DB_30.db')
cursor = con.cursor()
# cursor.execute("SELECT name FROM sqlite_master WHERE type='table';")
cursor.execute("select*FROM score ")

print(cursor.fetchall())


