li_q = ['1', '3', '4', 'wow', '5']

li_res = []

for a in li_q:
    #예외발생 가능
    try:
        int(a)
        #li_res.append(a)
    #예외발생하면 실행
    except Exception as e:
        # pass
        print('type(e) : ', type(e))
        print('Exception e : ', e)
    #예외발생안했을때
    else:
        li_res.append(a)
        print(li_q)
        print(li_res)
    #무조건 실행
    finally:
        print('--------------------')