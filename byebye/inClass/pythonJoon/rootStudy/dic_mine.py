import datetime

list_data = []

for i in range(5):
    now = datetime.datetime.now()
    day = str(now.day)
    mon = str(now.month)

    key_name = mon +'/'+ day

    # #센서 데이터 가져오기
    dic_temp = {
        key_name : {'data1' : "측정값"+str(i)}
        }
    # dic_temp = {
    #     key_name : "측정값"+str(i)
    #     }

    # 측정데이터 저장 (list, db, file, 네트워크)
    list_data.append(dic_temp) 

    for k in range(100000):
        pass


for dic in list_data:
    print(dic)

