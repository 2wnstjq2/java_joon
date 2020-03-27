def repeat(n, *val):
    
    for i in range(n):
        # 가변매개변수의 데이터를 출력
        for a in val:
            print(a, 'arg', end=' / ',sep=' % ')
        print()

repeat(2, 'hi', '메롱', 'wow')


# def ma(*val):
  
#     for i in val:
#         # 가변매개변수의 데이터를 출력
#         res = ''
#         for v in val:
#             res += v
#             res += '|'

#         return res

#     print(ma(2, 'hi', '메롱', 'wow'))

print()
       
def mb(*val):
        # 가변매개변수의 데이터를 출력
        res = ''
        for v in val:
            res += v
            res += '|'

        return res

print(mb('hi', '메롱', 'wow'))