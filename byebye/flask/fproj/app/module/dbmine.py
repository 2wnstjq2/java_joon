import sqlite3

class Database():
    def __init__(self):
        self.db= sqlite3.connect('sample')
        self.cursor= self.db.cursor()

     def execute(self, query, args={}):
        self.cursor.execute(query, args) 

    def executeOne(self, query, args={}):
        self.cursor.execute(query, args)
        row= self.cursor.fetchone()
        return row
 
    def executeAll(self, query, args={}):
        self.cursor.execute(query, args)
        row= self.cursor.fetchall()
        return row
 
    def commit(self):
        self.db.commit()